package com.example.CadastroAPI.Actions;

import com.example.CadastroAPI.Data.DataModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_actions")
public class ActionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private String description;

    // Um usuário pode possuir vários registros de DataModel.
    // Cada registro de DataModel pertence a um único usuário.
    @OneToMany (mappedBy = "data")
    private List<DataModel> data;

    //Vazio
    public ActionModel() {
    }

    //Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


