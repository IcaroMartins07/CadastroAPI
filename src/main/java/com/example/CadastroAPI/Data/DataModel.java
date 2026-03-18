package com.example.CadastroAPI.Data;

import com.example.CadastroAPI.Actions.ActionModel;
import jakarta.persistence.*;


@Entity  //trasforma uma classe em entidade
@Table(name = "tb_cadastro")  //Cria uma tabela
//Objeto
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

    //Construtor Vazio
    public DataModel() {

    }

    //Construtor Com info
    public DataModel(Long id, String nome, String email, int idade) {
         this.id = id;
         this.nome = nome;
         this.email = email;
         this.idade = idade;

    }

    //Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
