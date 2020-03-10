package com.example.DatabaseConnection.controllers;

        import com.example.DatabaseConnection.model.Users;
        import com.example.DatabaseConnection.service.NameService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.stereotype.Controller;


@Controller
public class NameController
{
    @Autowired
    private NameService nameService;


    @GetMapping("/view")
    public String submissionForm(Model model)
    {
        model.addAttribute("users", new Users());
        return "naming";
    }


    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String save(@ModelAttribute("users") Users users, Model model)
    {
        nameService.saveUser(users);
        return "saved";
    }
    @RequestMapping(value ="/nicks", method = RequestMethod.GET)
    public String showAll(Model model)
    {
        model.addAttribute("users",nameService.listAllUsers());
        return "table";
    }
}
