package org.hoxton.zabbix;

import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;

public interface Zabbix {
    HostResponse getHostInfo();

    ItemResponse getItemInfo();
}
