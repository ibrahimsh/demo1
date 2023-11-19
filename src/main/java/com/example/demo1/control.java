package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class control {
    @RequestMapping(value = "/welcome")
    public String start()
    {
        return "<h1> this  is  my  first web apps</h1>";
    }

    @RequestMapping(value = "/test")
    public String greetings(){
        return "welcom to springboot";
    }
}
