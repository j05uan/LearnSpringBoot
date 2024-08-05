package com.app.j3.app_j3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.j3.app_j3.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    
    public String details(Model model) {
        User user = new User("Juan Pablo",  "López");
        model.addAttribute("title", "Desarrollando con Spring boot ");
        model.addAttribute("user", user);        
        return "details";
    }

    

}
