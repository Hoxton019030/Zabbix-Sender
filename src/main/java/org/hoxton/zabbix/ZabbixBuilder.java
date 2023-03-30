package org.hoxton.zabbix;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpClient;

@Data
public class ZabbixBuilder {

    String user;
    String password;
    String auth;
    String url;
    LoginAPI loginAPI;

    public ZabbixBuilder(String user, String password, String auth, String url) {
        this.user = user;
        this.password = password;
        this.auth = auth;
        this.url = url;
    }

    public ZabbixBuilder(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public static ZabbixBuilder createDefault(String user, String password, String url) throws IOException {
        return new ZabbixBuilder(user, password, url);
    }

    public Zabbix build() {
        loginAPI = new LoginAPI();
        String login = loginAPI.login(user, password, url);
        return null;
    }


}
