package ru.zaikin.requestnotificationmicroservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @Value("${test.value}")
    private String testValue;

    @GetMapping("/test")
    public String getValue() {
        return testValue;
    }



}
