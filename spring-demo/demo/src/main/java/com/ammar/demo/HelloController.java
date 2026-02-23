package com.ammar.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello customer, spring boot is workin";
    }

    @GetMapping("/health")
    public String hello2() {
        return "Hello customer, this is / health route";
    }
    
}
