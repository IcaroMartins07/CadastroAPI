package com.example.CadastroAPI.repository;

import com.example.CadastroAPI.model.ActionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<ActionModel, Long> {
}