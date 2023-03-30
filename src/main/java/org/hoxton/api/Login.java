package org.hoxton.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hoxton.builder.ZabbixBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class Login {

    /**
     * @return login token
     * <img src="https://i.imgur.com/qVcWItY.png" />
     */
    public String login() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson = getLoginRequestBody(ZabbixBuilder.user, ZabbixBuilder.password);
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpUriRequest build = RequestBuilder
                    .get(ZabbixBuilder.url)
                    .setEntity(new StringEntity(requestJson.toString()))
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();
            String s = EntityUtils.toString(httpClient.execute(build).getEntity());
            JsonNode jsonNode = objectMapper.readTree(s);
            return jsonNode.get("result").asText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private JsonNode getLoginRequestBody(String user, String password) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson;
        try (FileReader fileReader = new FileReader("src/main/java/org/hoxton/zabbix/zabbix-request.json")) {
            requestJson = objectMapper.readTree(fileReader);
            ObjectNode paramsNode = objectMapper.createObjectNode();
            paramsNode.put("user", user);
            paramsNode.put("password", password);
            ((ObjectNode) requestJson).set("params", paramsNode);
            ((ObjectNode) requestJson).put("method", "user.login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return requestJson;
    }
}
