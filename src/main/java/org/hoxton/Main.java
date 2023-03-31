package org.hoxton;

import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;
import org.hoxton.zabbix.Zabbix;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        HostResponse hostInfo = zabbix.host().getHostResponse();
        System.out.println("hostInfo = " + hostInfo);



    }
}