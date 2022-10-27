package org.fofaviewer.bean;

import java.util.Map;

public class FofaBean {
    public String email;
    public String key;
    public String page = "1";
    public final int max = 10000;
    private String size = "1000";

    public FofaBean(String m, String k) {
        this.email = m;
        this.key = k;
    }

    public String getSize() {
        return this.size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getParam(String page) {
        String fields = "host,title,ip,domain,port,protocol,server";
        String queryUrl = "https://fofa.info/api/v1/search/all";
        if(page != null) {
            return queryUrl + "?email=" + email
                    + "&key=" + key
                    + "&page=" + page
                    + "&size=" + size
                    + "&fields=" + fields
                    + "&qbase64=";
        }else{
            return queryUrl + "?email=" + email
                    + "&key=" + key
                    + "&page=" + this.page
                    + "&size=" + size
                    + "&fields=" + fields
                    + "&qbase64=";
        }
    }
}
