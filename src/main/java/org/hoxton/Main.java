package org.hoxton;

import org.hoxton.zabbix.Zabbix;
import org.hoxton.zabbix.ZabbixBuilder;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
    }
}