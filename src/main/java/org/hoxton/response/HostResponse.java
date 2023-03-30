package org.hoxton.response;

import lombok.Data;

import java.util.List;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
@Data
public class HostResponse extends Response {
    private String jsonrpc;
    private List<Host> result;
    private int id;
}

@Data
class Host {
    public String hostid;
    public String proxy_hostid;
    public String host;
    public String status;
    public String disable_until;
    public String error;
    public String available;
    public String errors_from;
    public String lastaccess;
    public String ipmi_authtype;
    public String ipmi_privilege;
    public String ipmi_username;
    public String ipmi_password;
    public String ipmi_disable_until;
    public String ipmi_available;
    public String snmp_disable_until;
    public String snmp_available;
    public String maintenanceid;
    public String maintenance_status;
    public String maintenance_type;
    public String maintenance_from;
    public String ipmi_errors_from;
    public String snmp_errors_from;
    public String ipmi_error;
    public String snmp_error;
    public String jmx_disable_until;
    public String jmx_available;
    public String jmx_errors_from;
    public String jmx_error;
    public String name;
    public String flags;
    public String templateid;
    public String description;
    public String tls_connect;
    public String tls_accept;
    public String tls_issuer;
    public String tls_subject;
    public String tls_psk_identity;
    public String tls_psk;
    public String proxy_address;
    public String auto_compress;
    public String inventory_mode;
    public List<Interface> interfaces;

    // getters and setters
}

@Data
class Interface {
    private String interfaceid;
    private String ip;
}
