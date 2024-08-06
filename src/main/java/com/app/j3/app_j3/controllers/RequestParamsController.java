package com.app.j3.app_j3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.j3.app_j3.models.dto.ParamsDto;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {
    @GetMapping("/foo")
    public ParamsDto foot(@RequestParam(required = false, defaultValue = "HolaMundo") String message) {
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
    }
}