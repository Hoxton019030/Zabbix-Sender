package org.hoxton.request.host;

import org.hoxton.request.GetRequestCommonParams;
import org.hoxton.request.ZabbixApiRequest;
import org.hoxton.util.ZbxListUtils;

import java.util.List;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class HostGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public HostGetRequest() {
        setMethod("host.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        private List<Integer> groupids;
        private List<Integer> applicationids;
        private List<Integer> dserviceids;
        private List<Integer> graphids;
        private List<Integer> hostids;
        private List<Integer> httptestids;
        private List<Integer> interfaceids;
        private List<Integer> itemids;
        private List<Integer> maintenanceids;
        private boolean monitored_hosts;
        private boolean proxy_hosts;
        private List<Integer> proxyids;
        private boolean templated_hosts;
        private List<Integer> templateids;
        private List<Integer> triggerids;
        private String selectGroups;
        private String selectApplications;
        private String selectDiscoveries;
        private String selectDiscoveryRule;
        private String selectGraphs;
        private String selectHostDiscovery;
        private String selectHttpTests;
        private String selectInterfaces;
        private String selectInventory;
        private String selectItems;
        private String selectMacros;
        private String selectParentTemplates;
        private String selectScreens;
        private String selectTriggers;

        public Params() {
        }

        public String getSelectGroups() {
            return selectGroups;
        }

        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }

        public String getSelectApplications() {
            return selectApplications;
        }

        public void setSelectApplications(String selectApplications) {
            this.selectApplications = selectApplications;
        }

        public String getSelectDiscoveries() {
            return selectDiscoveries;
        }

        public void setSelectDiscoveries(String selectDiscoveries) {
            this.selectDiscoveries = selectDiscoveries;
        }

        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }

        public String getSelectGraphs() {
            return selectGraphs;
        }

        public void setSelectGraphs(String selectGraphs) {
            this.selectGraphs = selectGraphs;
        }

        public String getSelectHostDiscovery() {
            return selectHostDiscovery;
        }

        public void setSelectHostDiscovery(String selectHostDiscovery) {
            this.selectHostDiscovery = selectHostDiscovery;
        }

        public String getSelectHttpTests() {
            return selectHttpTests;
        }

        public void setSelectHttpTests(String selectHttpTests) {
            this.selectHttpTests = selectHttpTests;
        }

        public String getSelectInterfaces() {
            return selectInterfaces;
        }

        public void setSelectInterfaces(String selectInterfaces) {
            this.selectInterfaces = selectInterfaces;
        }

        public String getSelectInventory() {
            return selectInventory;
        }

        public void setSelectInventory(String selectInventory) {
            this.selectInventory = selectInventory;
        }

        public String getSelectItems() {
            return selectItems;
        }

        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
        }

        public String getSelectMacros() {
            return selectMacros;
        }

        public void setSelectMacros(String selectMacros) {
            this.selectMacros = selectMacros;
        }

        public String getSelectParentTemplates() {
            return selectParentTemplates;
        }

        public void setSelectParentTemplates(String selectParentTemplates) {
            this.selectParentTemplates = selectParentTemplates;
        }

        public String getSelectScreens() {
            return selectScreens;
        }

        public void setSelectScreens(String selectScreens) {
            this.selectScreens = selectScreens;
        }

        public String getSelectTriggers() {
            return selectTriggers;
        }

        public void setSelectTriggers(String selectTriggers) {
            this.selectTriggers = selectTriggers;
        }

        public void setApplicationId(int id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public List<Integer> getGroupids() {
            return groupids;
        }

        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        public List<Integer> getApplicationids() {
            return applicationids;
        }

        public void setApplicationids(List<Integer> applicationids) {
            this.applicationids = applicationids;
        }

        public List<Integer> getDserviceids() {
            return dserviceids;
        }

        public void setDserviceids(List<Integer> dserviceids) {
            this.dserviceids = dserviceids;
        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getHttptestids() {
            return httptestids;
        }

        public void setHttptestids(List<Integer> httptestids) {
            this.httptestids = httptestids;
        }

        public List<Integer> getInterfaceids() {
            return interfaceids;
        }

        public void setInterfaceids(List<Integer> interfaceids) {
            this.interfaceids = interfaceids;
        }

        public List<Integer> getItemids() {
            return itemids;
        }

        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        public List<Integer> getMaintenanceids() {
            return maintenanceids;
        }

        public void setMaintenanceids(List<Integer> maintenanceids) {
            this.maintenanceids = maintenanceids;
        }

        public List<Integer> getProxyids() {
            return proxyids;
        }

        public void setProxyids(List<Integer> proxyids) {
            this.proxyids = proxyids;
        }

        public List<Integer> getTemplateids() {
            return templateids;
        }

        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }

        public List<Integer> getTriggerids() {
            return triggerids;
        }

        public void setTriggerids(List<Integer> triggerids) {
            this.triggerids = triggerids;
        }

        public boolean isProxy_hosts() {

            return proxy_hosts;
        }

        public void setProxy_hosts(boolean proxy_hosts) {
            this.proxy_hosts = proxy_hosts;
        }

        public boolean isMonitored_hosts() {
            return monitored_hosts;
        }

        public void setMonitored_hosts(boolean monitored_hosts) {
            this.monitored_hosts = monitored_hosts;
        }

        public boolean isTemplated_hosts() {
            return templated_hosts;
        }

        public void setTemplated_hosts(boolean templated_hosts) {
            this.templated_hosts = templated_hosts;
        }

        public void setDserviceId(int id) {
            dserviceids = ZbxListUtils.add(dserviceids, id);
        }

        public void setGraphId(int id) {
            graphids = ZbxListUtils.add(graphids, id);
        }
    }

}