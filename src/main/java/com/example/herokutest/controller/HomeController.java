package com.example.herokutest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("name", "dundung");
        return "test";
    }
}
