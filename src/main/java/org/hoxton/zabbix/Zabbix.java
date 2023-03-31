package org.hoxton.zabbix;

import org.hoxton.api.Host;
import org.hoxton.api.Item;
import org.hoxton.response.HostResponse;
import org.hoxton.response.ItemResponse;

public interface Zabbix {
    Item item();
    Host host();
}
