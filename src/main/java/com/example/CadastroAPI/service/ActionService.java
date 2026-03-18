package com.example.CadastroAPI.service;

import com.example.CadastroAPI.model.ActionModel;
import com.example.CadastroAPI.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {

    @Autowired
    private ActionRepository repository;

    public List<ActionModel> findAll() {
        return repository.findAll();
    }

    public ActionModel create(ActionModel action) {
        return repository.save(action);
    }
}