package org.hoxton.zabbix;

import org.hoxton.response.HostResponse;

public interface Zabbix {
    HostResponse getHostInfo();
}
