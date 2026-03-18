package com.example.CadastroAPI.controller;

import com.example.CadastroAPI.model.ActionModel;
import com.example.CadastroAPI.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actions")
public class ActionController {

    @Autowired
    private ActionService service;

    @GetMapping
    public List<ActionModel> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ActionModel create(@RequestBody ActionModel action) {
        return service.create(action);
    }
}