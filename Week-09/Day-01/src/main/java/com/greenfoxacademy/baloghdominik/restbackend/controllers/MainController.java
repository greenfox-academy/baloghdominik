package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @RequestMapping(value = {"", "/"})
    public String index() {
        return "index";
    }
}
