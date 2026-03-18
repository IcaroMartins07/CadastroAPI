package com.example.CadastroAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity  //trasforma uma classe em entidade
@Table(name = "tb_cadastro")  //Cria uma tabela

//Anotations para criar construtores
@NoArgsConstructor
@AllArgsConstructor

//Anotations para criar os Getters e Setter
@Data
public class DataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id automaticamente
    private Long id;
    private String nome;
    private  String email;
    private int idade;


    // Um usuário pode estar associado a uma única ação,
    // porém uma mesma ação pode estar associada a vários usuários.
    @ManyToOne
    @JoinColumn(name = "action_id") //Foreing key

    private ActionModel action;


}
