package org.hoxton.zabbix;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LoginRequest {

    /**
     * @param user Zabbix Username
     * @param password Zabbix Password
     * @param url your Zabbix uil
     * @return login token
     * <img src="https://i.imgur.com/qVcWItY.png" />
     */
    public String login(String user, String password, String url) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson = getLoginRequestBody(user, password);
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpUriRequest build = RequestBuilder
                    .get(new URI(url))
                    .setEntity(new StringEntity(requestJson.toString()))
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();

            System.out.println("EntityUtils.toString(httpClient.execute(build).getEntity()) = " + EntityUtils.toString(httpClient.execute(build).getEntity()));
            String s = EntityUtils.toString(httpClient.execute(build).getEntity());
            JsonNode jsonNode = objectMapper.readTree(s);
            String result = jsonNode.get("result").asText();
            System.out.println("result = " + result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return null;

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
