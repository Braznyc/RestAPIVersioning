package com.ricardo.restapiversioning.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

    // Version 1 of the greeting endpoint
    @GetMapping("api/v1/greeting")
    public String getGreetingV1() {
        return "Hello from API version 1";
    }

    // Version 2 of the greeting endpoint
    @GetMapping("api/v2/greeting")
    public String getGreetingV2() {
        return "Hello from API version 2 with more features";
    }
}
