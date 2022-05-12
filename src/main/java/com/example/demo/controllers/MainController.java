package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(Model model) {
        model.addAttribute("name", "Emily");
        return "page2";
    }

    //via localhost:port/demo/page3?name=...
    @GetMapping("/page3")
    public String page3(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("name", name);
        return "page3";
    }

    //via localhost:port/demo/page3/...
    @GetMapping("/page3/{name}")
    public String page4(Model model, @PathVariable(value = "name") String name) {
        model.addAttribute("name", name);
        return "page3";
    }
}
