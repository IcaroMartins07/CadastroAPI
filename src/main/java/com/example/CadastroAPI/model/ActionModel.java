package com.example.CadastroAPI.model;

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
    private List<DataModel> data;


}


