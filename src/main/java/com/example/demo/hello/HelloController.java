package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "/hello";
    }
    @Autowired
    private HelloService service;
    @GetMapping("/response")
    public String helloResponse(Model model){
       String currentTime = service.getCurrentTime();
       model.addAttribute("currentTime",currentTime);
        return "/response";
    }
}

