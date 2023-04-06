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
public class
ItemGetResponse extends Response {
    List<Result> result = new ArrayList<>();

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        private String itemid;
        private String type;
        private String snmp_oid;
        private String hostid;
        private String name;
        private String key_;
        private String delay;
        private String history;
        private String trends;
        private String status;
        private String value_type;
        private String trapper_hosts;
        private String units;
        private String formula;
        private String logtimefmt;
        private String templateid;
        private String valuemapid;
        private String params;
        private String ipmi_sensor;
        private String authtype;
        private String username;
        private String password;
        private String publickey;
        private String privatekey;
        private String flags;
        private String interfaceid;
        private String description;
        private String inventory_link;
        private String lifetime;
        private String evaltype;
        private String jmx_endpoint;
        private String master_itemid;
        private String timeout;
        private String url;
        ArrayList<Object> query_fields = new ArrayList<>();
        private String posts;
        private String status_codes;
        private String follow_redirects;
        private String post_type;
        private String http_proxy;
        //        ArrayList < Object > headers = new ArrayList <> (); //幹他媽的這東西一直出問題
        private String retrieve_mode;
        private String request_method;
        private String output_format;
        private String ssl_cert_file;
        private String ssl_key_file;
        private String ssl_key_password;
        private String verify_peer;
        private String verify_host;
        private String allow_traps;
        private String state;
        private String error;
        private String lastclock;
        private String lastns;
        private String lastvalue;
        private String prevvalue;
    }
}
