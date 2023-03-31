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
import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class Item extends ZabbixApiMethod{
    String url;
    String token;

    public Item(String url, String token) {
        super(url, token);
        this.url = url;
        this.token = token;
    }

    public ItemResponse getItemInfo(String token, String url){
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson = getItemRequestBody(token);
        System.out.println("requestJson.toString() = " + requestJson.toString());
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpUriRequest build = RequestBuilder
                    .get(new URI(url))
                    .setEntity(new StringEntity(requestJson.toString()))
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();
            String s = EntityUtils.toString(httpClient.execute(build).getEntity());
            ItemResponse hostResponse = objectMapper.readValue(s, ItemResponse.class);
            return hostResponse;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private JsonNode getItemRequestBody(String token) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestJson;
        try (FileReader fileReader = new FileReader("src/main/java/org/hoxton/zabbix/zabbix-request.json")) {
            requestJson = objectMapper.readTree(fileReader);
            ObjectNode paramsNode = objectMapper.createObjectNode();
            paramsNode.put("output", "extend");
            ((ObjectNode) requestJson).set("params", paramsNode);
            ((ObjectNode) requestJson).put("method", "item.get");
            ((ObjectNode) requestJson).put("auth", token);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return requestJson;
    }

    public ItemResponse getItemInfo(int itemId) {

        return null;
    }
}
