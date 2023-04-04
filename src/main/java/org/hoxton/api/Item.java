package org.hoxton.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hoxton.request.item.ItemGetRequest;
import org.hoxton.response.ItemGetResponse;
import org.hoxton.util.GsonUtils;
import org.hoxton.util.JacksonUtils;


import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class Item extends ZabbixApiMethod{



    public Item(String url, String token) {
        super(url, token);
    }

    public ItemGetResponse getItem(ItemGetRequest itemGetRequest) throws JsonProcessingException {
        itemGetRequest.setAuth(token);
        ObjectMapper objectMapper = JacksonUtils.objectMapper();
        Gson gson = GsonUtils.gsonBuilder();
        String request = gson.toJson(itemGetRequest);
        System.out.println("request = " + request);
        String s = sendRequest(request);
        return objectMapper.readValue(s, ItemGetResponse.class);

    }

}
