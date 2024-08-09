package com.app.j3.app_j3.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.j3.app_j3.models.User;
import com.app.j3.app_j3.models.dto.ParamsDto;

@RestController
@RequestMapping("api")
public class RequestParamsController {
    @GetMapping("/foo")
    public ParamsDto foot(@RequestParam(required = false, defaultValue = "HolaMundo") String message) {
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
    }

    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamsDto params = new ParamsDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request/{cedula}")
    public List<User> users(@PathVariable int cedula) {
        User user = new User();
        user.setCedula(123456);
        user.setNombre("Juan");
        user.setApellido("Lopez");
        user.setEmail("email");
        List<User> usersLis = Arrays.asList(user);

        return usersLis;
    }
}