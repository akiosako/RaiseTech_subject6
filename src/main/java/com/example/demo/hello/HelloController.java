package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService service;
    public HelloController(HelloService service) {
        this.service = service;
    }
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
    @GetMapping("/response")
    public String helloResponse(){
        return service.getCurrentTime();
    }
}
