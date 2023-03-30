package org.hoxton.zabbix;

import lombok.Data;

import java.io.IOException;

@Data
public class ZabbixBuilder {

    String user;
    String password;
    String auth;
    String url;
    LoginRequest loginRequest;


    public ZabbixBuilder(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.loginRequest =new LoginRequest();
    }

    public static ZabbixBuilder createDefault(String user, String password, String url) throws IOException {
        return new ZabbixBuilder(user, password, url);
    }

    public Zabbix build() {
        String login = loginRequest.login(user,password,url);

        return null;
    }


}
