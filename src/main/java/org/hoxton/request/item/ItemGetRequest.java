package org.hoxton.request.item;

import lombok.Data;
import org.hoxton.request.GetRequestCommonParams;
import org.hoxton.request.ZabbixApiRequest;
import org.hoxton.request.host.HostGetRequest;

import java.util.List;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
@Data
public class ItemGetRequest extends ZabbixApiRequest {
    public ItemGetRequest() {
        setMethod("item.get");
    }

    private Params params = new Params();

    @Data
    public class Params extends GetRequestCommonParams {
        private List<Integer> itemids;
        private List<Integer> groupids;
        private List<Integer> templateids;
        private List<Integer> hostids;
        private List<Integer> proxyids;
        private List<Integer> interfaceids;
        private List<Integer> graphids;
        private List<Integer> triggerids;
        private List<Integer> applicationids;
        private Boolean webitems;
        private Boolean inherited;
        private Boolean templated;
        private Boolean monitored;
        private String group;
        private String host;
        private String application;
        private Boolean with_triggers;
    }
}
