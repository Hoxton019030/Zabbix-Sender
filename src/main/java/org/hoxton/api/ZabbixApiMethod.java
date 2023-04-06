package org.hoxton.api;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.http.HttpResponse;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class ZabbixApiMethod {

    String url;
    String token;

    public ZabbixApiMethod(String url, String token) {
        this.url = url;
        this.token = token;
    }

    /**
     * protected 只可被繼承類所調用，不可被外部方法所使用
     * @param requestJson
     * @return
     */
    protected String sendRequest(String requestJson) {

        HttpResponse httpResponse;

        HttpPost httpPost = new HttpPost(url);

        String responseBody;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpUriRequest build = RequestBuilder.get(url).setEntity(new StringEntity(requestJson.toString()))
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .build();
            responseBody = EntityUtils.toString(httpClient.execute(build).getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return responseBody;
    }
}
