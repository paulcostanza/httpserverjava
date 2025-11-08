package com.codefromscratch.httpserver;

import com.codefromscratch.httpserver.config.Configuration;
import com.codefromscratch.httpserver.config.ConfigurationManager;

/**
 * Driver Class for the Http Server
 */
public class HttpServer {
    public static void main(String[] args) {
        System.out.println("Yo the server is starting, foo!");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port: " + conf.getPort());
        System.out.println("Using Webroot: " + conf.getWebroot());
    }
}
