package ru.zaikin.userstoragemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserStorageMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserStorageMicroserviceApplication.class, args);
    }

}
