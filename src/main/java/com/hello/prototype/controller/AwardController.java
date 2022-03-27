package com.hello.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AwardController {
    @GetMapping("/award")
    public String home() {
        return "awards/awardList";
    }
}
