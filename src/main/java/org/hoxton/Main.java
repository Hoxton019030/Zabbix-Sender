package org.hoxton;

import org.hoxton.api.request.HostGetRequest;
import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;
import org.hoxton.util.ZbxListUtils;
import org.hoxton.zabbix.Zabbix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
//        HostResponse hostInfo = zabbix.host().getHostResponse();
//        zabbix.item().getItemInfo(10440);
        List<Integer> arrayList=null;
//        HostGetRequest hostGetRequest = new HostGetRequest();
//        HostGetRequest.Params params = hostGetRequest.getParams();
        List<Integer> add = ZbxListUtils.add(arrayList, 1);
         add = ZbxListUtils.add(arrayList, 2);

        System.out.println("\"test\" = " + "test");
        arrayList.forEach(integer -> {
            System.out.println("integer = " + integer);
        });


        List<Integer> testList;
        boolean add1 = testList.add(1);
//        testList.add(1);
//        testList.add(2);
//        testList.forEach(integer -> {
//            System.out.println("testinteger = " + integer);
//        });

    }
}