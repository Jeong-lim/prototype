package com.hello.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateMemberController {
    @GetMapping("/members/new")
    public String home() {
        return "members/createMemberForm";
    }
}
