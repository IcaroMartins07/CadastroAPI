package com.example.CadastroAPI.service;

import com.example.CadastroAPI.model.ActionModel;
import com.example.CadastroAPI.model.DataModel;
import com.example.CadastroAPI.repository.ActionRepository;
import com.example.CadastroAPI.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository repository;

    @Autowired
    private ActionRepository actionRepository;

    public List<DataModel> findAll() {
        return repository.findAll();
    }

    public DataModel create(DataModel data) {

        if (data.getAction() != null && data.getAction().getId() != null) {
            ActionModel action = actionRepository.findById(data.getAction().getId())
                    .orElseThrow(() -> new RuntimeException("Ação não encontrada"));

            data.setAction(action);
        }

        return repository.save(data);
    }

    public DataModel update(Long id, DataModel data) {
        DataModel existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existing.setNome(data.getNome());
        existing.setEmail(data.getEmail());
        existing.setIdade(data.getIdade());

        if (data.getAction() != null && data.getAction().getId() != null) {
            ActionModel action = actionRepository.findById(data.getAction().getId())
                    .orElseThrow(() -> new RuntimeException("Ação não encontrada"));

            existing.setAction(action);
        }

        return repository.save(existing);
    }

    public void delete(Long id) {
        DataModel existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        repository.delete(existing);
    }
}