package com.app.j3.app_j3.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.j3.app_j3.models.User;

@RestController
@RequestMapping("/v2/details")
public class UserRestController {

    @GetMapping("/details")
    public Map<String,Object> details(){
        User user = new User("Juan Pablo", "López");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot");
        body.put("user", user);
        
        return body;
    }
    
}
