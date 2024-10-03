package com.example.springjte.controller;

import com.example.springjte.page.HomePage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        var homePage = new HomePage("Hello World", "This is my home page!");
        var items = List.of("Item 1", "Item 2", "Item 3");

        model.addAttribute("name", "Alif");
        model.addAttribute("items", items);
        model.addAttribute("page", homePage);

        return "index";
    }
}
