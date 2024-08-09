package com.app.j3.app_j3.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.j3.app_j3.models.User;
import com.app.j3.app_j3.models.dto.ParamsDto;

public class PathVariableController {

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
    @Value("${app.listaroles}")
    private List<String> lstroles;
    @Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
    @Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
    }
    @GetMapping("/producto/{productname}/{id}")
    public Map<String,Object> getProduct(@PathVariable String productname,@PathVariable Long id ){
        Map<String,Object> jsonData = new HashMap<>();
        jsonData.put("product", productname);
        jsonData.put("id", id);
        return jsonData;
    }
    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
        user.setNombre(user.getNombre().toUpperCase());
        return user;
    }
    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("message",message);
        return json;
    }
}   


