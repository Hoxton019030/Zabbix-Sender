package org.hoxton.response;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public abstract class Response {
    private int id;
    private String jsonrpc;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }
}
