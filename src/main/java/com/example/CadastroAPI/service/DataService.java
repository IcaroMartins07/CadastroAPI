package com.example.CadastroAPI.service;

import com.example.CadastroAPI.model.DataModel;
import com.example.CadastroAPI.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository repository;

    public List<DataModel> findAll() {
        return repository.findAll();
    }

    public DataModel create(DataModel data) {
        return repository.save(data);
    }
}