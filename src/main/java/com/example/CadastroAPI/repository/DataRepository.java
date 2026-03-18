package com.example.CadastroAPI.repository;

import com.example.CadastroAPI.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataModel, Long> {
}