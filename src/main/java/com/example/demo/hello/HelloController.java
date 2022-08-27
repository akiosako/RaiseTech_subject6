package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello(Model model){
        String currentTime = service.getCurrentTime();
        model.addAttribute("currentTime",currentTime);
        return "hello";
    }
}
