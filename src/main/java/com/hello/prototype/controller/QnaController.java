package com.hello.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnaController {
    @GetMapping("/qna")
    public String home() {
        return "qna/createQna";
    }
}
