package org.hoxton.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemResponse extends Response{
    public String jsonrpc;
    public List<Result> result;
    public int id;
}
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
 class Result{
    public String itemid;
    public String type;
    public String snmp_oid;
    public String hostid;
    public String name;
    public String key_;
    public String delay;
    public String history;
    public String trends;
    public String status;
    public String value_type;
    public String trapper_hosts;
    public String units;
    public String formula;
    public String logtimefmt;
    public String templateid;
    public String valuemapid;
    public String params;
    public String ipmi_sensor;
    public String authtype;
    public String username;
    public String password;
    public String publickey;
    public String privatekey;
    public String flags;
    public String interfaceid;
    public String description;
    public String inventory_link;
    public String lifetime;
    public String evaltype;
    public String jmx_endpoint;
    public String master_itemid;
    public String timeout;
    public String url;
    public List<Object> query_fields;
    public String posts;
    public String status_codes;
    public String follow_redirects;
    public String post_type;
    public String http_proxy;
//    public List<Map<String, String>> headers;
    public String retrieve_mode;
    public String request_method;
    public String output_format;
    public String ssl_cert_file;
    public String ssl_key_file;
    public String ssl_key_password;
    public String verify_peer;
    public String verify_host;
    public String allow_traps;
    public String state;
    public String error;
    public String lastclock;
    public String lastns;
    public String lastvalue;
    public String prevvalue;
}

