package com.highend.cms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getLoginPage() {
        return "/login";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

}
