package ru.zaikin.userstoragemicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/test")
    public String test() {
        return value;
    }




}
