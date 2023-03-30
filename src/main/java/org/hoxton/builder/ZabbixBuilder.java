package org.hoxton.builder;

import lombok.Data;
import org.hoxton.api.Login;
import org.hoxton.zabbix.Zabbix;
import org.hoxton.zabbix.ZabbixImpl;

import java.io.IOException;

@Data
public class ZabbixBuilder {

    String user;
    String password;
    String auth;
    String url;
    Login login;


    public ZabbixBuilder(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.login =new Login();
    }

    public static ZabbixBuilder createDefault(String user, String password, String url) throws IOException {
        return new ZabbixBuilder(user, password, url);
    }

    public Zabbix build() {
        String loginToken = this.login.login(user,password,url);
        return new ZabbixImpl(loginToken,url);

    }


}
