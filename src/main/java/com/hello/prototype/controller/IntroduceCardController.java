package com.hello.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroduceCardController {
    @GetMapping("/Introduce/card")
    public String home() {
        return "introduceCard/introduceCard";
    }
}
