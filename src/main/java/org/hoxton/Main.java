package org.hoxton;

import org.hoxton.request.host.HostGetRequest;
import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.request.item.ItemGetRequest;
import org.hoxton.response.ItemGetResponse;
import org.hoxton.response.host.HostGetResponse;
import org.hoxton.zabbix.Zabbix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        HostGetResponse hostResponse = zabbix.host().getHostResponse(new HostGetRequest());
        List<HostGetResponse.Result> result = hostResponse.getResult();


    }
}