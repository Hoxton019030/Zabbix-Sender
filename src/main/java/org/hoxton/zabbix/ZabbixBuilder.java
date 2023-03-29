package org.hoxton.zabbix;

import lombok.Data;

@Data
public class ZabbixBuilder {

     String user;
     String password;
     String auth;


     public static ZabbixBuilder createDefault(){
          return new ZabbixBuilder();
     }



}
