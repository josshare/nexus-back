package com.nexus.nexus_back.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {
    @RequestMapping("/home")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(PublicController.class, args);
    }
}
