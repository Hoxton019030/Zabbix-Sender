package org.hoxton.test;

import org.hoxton.builder.ZabbixBuilder;
import org.hoxton.zabbix.Zabbix;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

@ExtendWith(MockitoExtension.class)
class ZabbixBuilderTest {

    @Test
    public void createDefault_returnSucceed() throws IOException {
        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();




    }

}