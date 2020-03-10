package com.example.Blog.controllers;

        import com.example.Blog.model.Posts;
        import com.example.Blog.service.BlogService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.stereotype.Controller;


@Controller
public class NameController
{
    @Autowired
    private BlogService blogService;


    @GetMapping("/home")
    public String submissionForm(Model model)
    {
        model.addAttribute("users", new Posts());
        return "index";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String save(@ModelAttribute("users") Posts posts) {
        blogService.saveUser(posts);
        return "saved";
    }
}
