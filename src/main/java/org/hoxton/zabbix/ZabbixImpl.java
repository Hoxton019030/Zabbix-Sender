package org.hoxton.zabbix;

import org.hoxton.api.Host;
import org.hoxton.api.Item;
import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;

public class ZabbixImpl implements Zabbix {
    final String token;
    final String url;

    final org.hoxton.api.Host host;

    final Item item;

    public ZabbixImpl(String token, String url) {
        this.token = token;
        this.url = url;
        host = new org.hoxton.api.Host();
        item = new Item();
    }

    @Override
    public HostResponse getHostInfo() {
        return host.getHostResponse(token);
    }

    @Override
    public ItemResponse getItemInfo() {
        return item.getItemInfo(token, url);
    }

    @Override
    public Item item() {
        return item;
    }

    @Override
    public Host host() {
        return host;
    }
}
