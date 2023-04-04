package org.hoxton.builder;

import lombok.Data;
import org.hoxton.api.Login;
import org.hoxton.zabbix.Zabbix;
import org.hoxton.zabbix.ZabbixImpl;

import java.io.IOException;

@Data
public class ZabbixBuilder {

    public static String user;
    public static String password;
    public static String auth;
    public static String url;
    Login login;


    public ZabbixBuilder(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.login = new Login();
    }

    public static ZabbixBuilder createDefault(String user, String password, String url) throws IOException {
        return new ZabbixBuilder(user, password, url);
    }

    public Zabbix build() {
        auth = login.login();
        return new ZabbixImpl(auth, url);

    }


}
