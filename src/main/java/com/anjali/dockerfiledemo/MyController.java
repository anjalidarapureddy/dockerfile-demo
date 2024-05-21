package com.anjali.dockerfiledemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")
    public String getData() {
        return "Hello Docker welcome to the Project";
    }
}
