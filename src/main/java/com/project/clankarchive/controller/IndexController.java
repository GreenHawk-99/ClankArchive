package com.project.clankarchive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = {"/home"})
    public String index(){
        return "index/index";
    }

    @GetMapping(value = {"/login", "/home/login"})
    public String login(){
        return "index/login";
    }
}
