# Zabbix-Sender

你討厭Zabbix的API嗎？太好了，因為我也討厭，為你介紹Zabbix-Sender，我把Zabbix的所有方法封裝起來了



使用方法

```java
public class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        HostGetResponse hostResponse = zabbix.host().getHostResponse(new HostGetRequest());
        List<HostGetResponse.Result> result = hostResponse.getResult();
        

    }
}
```



zabbix物件底下有相對應的API Method (Host, Item ...)可以調用，目前也只有Host跟Item而已，希望有人可以補上其他的

# Zabbix-Sender

Do you hate Zabbix API? Great, because I hate it too. Let me introduce you to Zabbix-Sender, where I encapsulate all Zabbix methods.

Usage

```
javaCopy codepublic class Main {
    public static void main(String[] args) throws IOException {

        Zabbix zabbix = ZabbixBuilder.createDefault("Admin", "zabbix", "http://localhost/api_jsonrpc.php").build();
        HostGetResponse hostResponse = zabbix.host().getHostResponse(new HostGetRequest());
        List<HostGetResponse.Result> result = hostResponse.getResult();
        

    }
}
```

Under the zabbix object, there are corresponding API methods (Host, Item...) that can be called. Currently, only Host and Item are available. Hopefully, someone can add other methods.

Translated by ChatGPT
