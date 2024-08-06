package com.app.j3.app_j3.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.j3.app_j3.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Juan Pablo",  "López");
        user.setEmail("juampislopez@gmail.com");
        model.addAttribute("title", "Desarrollando con Spring boot ");
        model.addAttribute("user", user);        
        return "details";
    }

    // @GetMapping("/list")
    // public String list(ModelMap model){
    //     List<User> users = new ArrayList<>();
    //     model.addAttribute("title", "Listado de Usuarios");
    //     model.addAttribute("users", users);
    //     return "list";
    // }
    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
        new User("Carlos", "Perez"),
        new User("Martha","Sanchez"),
        new User("Vicente","Camargo")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }

}
