package com.example.CI_CD;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/")
    public String home() {
        return "Deployed on Elastic Beanstalk ✅";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
