package org.hoxton.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.hoxton.request.host.HostGetRequest;
import org.hoxton.response.host.HostGetResponse;
import org.hoxton.util.GsonUtils;
import org.hoxton.util.JacksonUtils;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class Host extends ZabbixApiMethod {

    public Host(String url, String token) {
        super(url,token);
    }
    public HostGetResponse getHostResponse(HostGetRequest hostGetRequest) throws JsonProcessingException {
        hostGetRequest.setAuth(token);
        String request = gson.toJson(hostGetRequest);
        String result = sendRequest(request);
        return objectMapper.readValue(result, HostGetResponse.class);
    }
}
