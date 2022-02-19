package main.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("pageTitle", "Blog");
        return "index";
    }
}
