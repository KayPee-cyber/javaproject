package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController
{
    @GetMapping("/home")
    public String showpage()
    {
        return "helloworld";
    }
}
