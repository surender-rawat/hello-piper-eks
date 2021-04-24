package com.paytm.hellopiper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloPiperApplication {

    public static void main(String[] args) {
       System.setProperty("server.servlet.context-path", "/data-service");
        SpringApplication.run(HelloPiperApplication.class, args);
    }

}
