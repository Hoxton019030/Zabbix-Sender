package org.hoxton.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.hoxton.response.HostResponse;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class Host extends ZabbixApiMethod {

    public Host(String url, String token) {
        super(url,token);
    }
    public HostResponse getHostResponse() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson = getHostRequestBody();
        String s1 = sendRequest(requestJson.toString());
        try {
            return objectMapper.readValue(s1, HostResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    private JsonNode getHostRequestBody() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson;
        try (FileReader fileReader = new FileReader("src/main/java/org/hoxton/zabbix/zabbix-request.json")) {
            requestJson = objectMapper.readTree(fileReader);
            ObjectNode paramsNode = objectMapper.createObjectNode();
            paramsNode.put("output", "extend");
            ((ObjectNode) requestJson).set("params", paramsNode);
            ((ObjectNode) requestJson).put("method", "host.get");
            ((ObjectNode) requestJson).put("auth", token);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return requestJson;
    }
}
