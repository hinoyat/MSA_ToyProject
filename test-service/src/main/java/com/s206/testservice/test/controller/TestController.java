package com.s206.testservice.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test-service")  // 기본 URL 경로 설정
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Test Service";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Service is working!";
    }
}