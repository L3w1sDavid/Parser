package com.lewis.parser;

public class WhoamIResponse {
    private String ipaddress;
    private String language;
    private String software;

    public WhoamIResponse(String ipaddress, String language, String software) {
        this.ipaddress = ipaddress;
        this.language = language;
        this.software = software;
    }
    public String getIpaddress() {return ipaddress;}
    public String getLanguage() {return language;}
    public String getSoftware() {
        return software;
    }
}