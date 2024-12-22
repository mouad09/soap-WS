package org.example;

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:5555/";
        Endpoint.publish(url, new BankService());
        System.out.println("WebService Deployed Successfully");
        System.out.println("URL: " + url);
    }
}