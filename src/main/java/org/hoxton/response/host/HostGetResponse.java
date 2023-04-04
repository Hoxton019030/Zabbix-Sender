package org.hoxton.response.host;

import lombok.*;
import org.hoxton.response.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostGetResponse extends Response {
    List<Result> result =  new ArrayList<>();



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Result{
        private String hostid;
        private String proxy_hostid;
        private String host;
        private String status;
        private String disable_until;
        private String error;
        private String available;
        private String errors_from;
        private String lastaccess;
        private String ipmi_authtype;
        private String ipmi_privilege;
        private String ipmi_username;
        private String ipmi_password;
        private String ipmi_disable_until;
        private String ipmi_available;
        private String snmp_disable_until;
        private String snmp_available;
        private String maintenanceid;
        private String maintenance_status;
        private String maintenance_type;
        private String maintenance_from;
        private String ipmi_errors_from;
        private String snmp_errors_from;
        private String ipmi_error;
        private String snmp_error;
        private String jmx_disable_until;
        private String jmx_available;
        private String jmx_errors_from;
        private String jmx_error;
        private String name;
        private String flags;
        private String templateid;
        private String description;
        private String tls_connect;
        private String tls_accept;
        private String tls_issuer;
        private String tls_subject;
        private String tls_psk_identity;
        private String tls_psk;
        private String proxy_address;
        private String auto_compress;
        private String inventory_mode;
    }
}