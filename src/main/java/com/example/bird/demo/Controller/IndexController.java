package com.example.bird.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")

public class IndexController {
    @RequestMapping("/hello")
    @ResponseBody

    public String hello(Model model){
        return "Hi, SpringBoots!";
    }

}
