package com.example.CadastroAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_actions")

@NoArgsConstructor
@AllArgsConstructor

@Data
public class ActionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private String description;

    // Um usuário pode possuir vários registros de DataModel.
    // Cada registro de DataModel pertence a um único usuário.
    @OneToMany (mappedBy = "action")
    @JsonIgnore
    private List<DataModel> data;


}


