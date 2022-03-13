package com.thomas.video.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/")
//    public String index() {
//        return "Hello World!";
//    }

    @GetMapping("/info")
    public String info() {
        return "This is a video streaming test app";
    }
}
