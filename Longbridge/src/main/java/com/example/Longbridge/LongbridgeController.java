package com.example.Longbridge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LongbridgeController
{
    @GetMapping("/testing")
    public String control()
    {
        return "long";
    }
}
