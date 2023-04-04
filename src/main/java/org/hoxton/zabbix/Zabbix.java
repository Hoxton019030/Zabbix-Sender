package org.hoxton.zabbix;

import org.hoxton.api.Host;
import org.hoxton.api.Item;

public interface Zabbix {
    Item item();
    Host host();
}
