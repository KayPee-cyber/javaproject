package com.example.registrationlogin.controller;

import com.example.registrationlogin.model.User;
import com.example.registrationlogin.model.UserLogin;
import com.example.registrationlogin.repository.UserLoginRepo;
import com.example.registrationlogin.repository.UserRepository;
import com.example.registrationlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class UserController
{

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserLoginRepo userLoginRepo;


    @GetMapping("/index")
    public String submissionForm(Model model)
    {
        model.addAttribute("user", new User());
        return "registration";
    }


    @RequestMapping(value = "/signup", method = {RequestMethod.POST,RequestMethod.GET})
    public String save(@ModelAttribute("user") User user)
    {
        userService.saveUser(user);
        return "login";
    }


    @RequestMapping(value ="/safecheck",  method = {RequestMethod.POST,RequestMethod.GET})
    public String listResults(@ModelAttribute("userLogin") UserLogin userLogin,Model model)
    {
        model.addAttribute("userLogin", userLogin);

        userService.saveUser(userLogin);
//        return "welcome";
        boolean userExists = userService.existsByEmailAndPassword(userLogin.getUsername(), userLogin.getPasscode());
//        boolean userExists = userRepository.existsByEmailAndPassword(user.getEmail(), user.getPassword());
        System.out.println(userExists);
        if  (userExists == true)
        {
            return "welcome";
        }
        else
        {
            return "notyet";
        }
    }


//    @RequestMapping(value = "/safecheck", method = RequestMethod.POST)
//    public String checkAndWelcome(@ModelAttribute("userlogin") User user, UserLogin userLogin)
//    {
//        boolean userExists = userRepository.existsByEmailAndPassword(userLogin.getUsername(), userLogin.getPasscode());
////        boolean userExists = userRepository.existsByEmailAndPassword(user.getEmail(), user.getPassword());
//        System.out.println(userExists);
//        if  (userExists == true)
//        {
//            return "welcome";
//        }
//        else
//        {
//            return "notyet";
//        }
//    }


}


