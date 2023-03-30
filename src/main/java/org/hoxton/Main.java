package org.hoxton;

import org.hoxton.response.HostResponse;
import org.hoxton.zabbix.Zabbix;
import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.zabbix.ZabbixImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        HostResponse hostInfo = zabbix.getHostInfo();
        System.out.println("hostInfo.toString() = " + hostInfo.toString());


    }
}