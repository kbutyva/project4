package com.amr.project.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPageController {
    @GetMapping("/user")
    public String userPage() {return "user"; }
}
