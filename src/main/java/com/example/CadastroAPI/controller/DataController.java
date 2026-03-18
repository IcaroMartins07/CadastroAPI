package com.example.CadastroAPI.controller;

import com.example.CadastroAPI.model.DataModel;
import com.example.CadastroAPI.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService service;

    @GetMapping
    public List<DataModel> findAll() {
        return service.findAll();
    }

    @PostMapping
    public DataModel create(@RequestBody DataModel data) {
        return service.create(data);
    }

    @PutMapping("/{id}")
    public DataModel update(@PathVariable Long id, @RequestBody DataModel data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}