package main.blog.controllers;

import main.blog.models.Post;
import main.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    PostService postService;
    @GetMapping("/")
    public String index(Model model){
        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5Posts", latest5Posts);
        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("latest3posts", latest3Posts);

        model.addAttribute("pageTitle", "Blog");
        return "index";
    }
}
