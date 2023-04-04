package org.hoxton.zabbix;

import org.hoxton.api.Host;
import org.hoxton.api.Item;

public class ZabbixImpl implements Zabbix {
    final String token;
    final String url;
    public ZabbixImpl(String token, String url) {
        this.token = token;
        this.url = url;
    }

    @Override
    public Item item() {
        return new Item(this.url,this.token);
    }

    @Override
    public Host host() {
        return new Host(this.url,this.token) ;
    }
}
