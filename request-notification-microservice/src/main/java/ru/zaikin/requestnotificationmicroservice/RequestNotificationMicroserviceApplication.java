package ru.zaikin.requestnotificationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RequestNotificationMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RequestNotificationMicroserviceApplication.class, args);
    }

}
