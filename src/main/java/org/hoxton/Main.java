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

public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        ItemGetResponse item = zabbix.item().getItem(new ItemGetRequest());
        List<ItemGetResponse.Result> result = item.getResult();
        System.out.println("result.size() = " + result.size());

        int count =0;
        for (ItemGetResponse.Result result1 : result) {
            if(result1.getName().equals("Available memory")){
                count ++;
                System.out.println("result1.getDescription() = " + result1.getDescription());

            }
        }

        System.out.println("count = " + count);


    }
}