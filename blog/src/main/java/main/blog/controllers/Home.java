package main.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Home {
    @GetMapping("{username}")
    public String index(@PathVariable String username, Model model){
        model.addAttribute("name",username);
        return "index";
    }
}
