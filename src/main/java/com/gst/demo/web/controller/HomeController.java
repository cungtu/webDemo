package com.gst.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/","/home"})
    public String index(Model model) {
        model.addAttribute("hello", "Hello from Tu Developer");
        return "index.html";
    }
}
