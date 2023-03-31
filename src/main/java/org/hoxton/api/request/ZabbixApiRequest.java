package org.hoxton.api.request;

import java.util.Random;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class ZabbixApiRequest {
    private Integer id = new Random().nextInt(Integer.MAX_VALUE);
    private String jsonrpc = "2.0";
    private String method;
    private String auth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
