package org.hoxton.zabbix;

import org.hoxton.response.HostResponse;

public class ZabbixImpl implements Zabbix {
    final String token;
    final String url;

    final org.hoxton.api.Host host;

    public ZabbixImpl(String token, String url) {
        this.token = token;
        this.url = url;
        host = new org.hoxton.api.Host();
    }

    @Override
    public HostResponse getHostInfo() {
        return host.getHostResponse(token,url);
    }
}
