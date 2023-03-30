package org.hoxton.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.response.HostResponse;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class Host {



    public HostResponse getHostResponse(String token) {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson = getHostRequestBody(token);
        System.out.println("requestJson.toString() = " + requestJson.toString());
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpUriRequest build = RequestBuilder
                    .get(ZabbixBuilder.url)
                    .setEntity(new StringEntity(requestJson.toString()))
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();
            String s = EntityUtils.toString(httpClient.execute(build).getEntity());
            HostResponse hostResponse = objectMapper.readValue(s, HostResponse.class);
            return hostResponse;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private JsonNode getHostRequestBody(String token) {
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
