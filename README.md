# 🚀 CadastroAPI - Spring Boot

## 📌 Sobre o projeto

Esta é uma API REST desenvolvida com **Spring Boot** para gerenciamento de usuários e suas ações.

A aplicação permite:

* Criar usuários
* Criar ações
* Associar usuários a ações
* Listar dados cadastrados
* Atualizar informações

---

## 🧠 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* H2 Database (banco em memória)
* Lombok
* Maven

---

## Arquitetura do projeto

A aplicação segue o padrão de camadas:

Controller → Service → Repository → Model

### Estrutura

```
controller  → Recebe requisições HTTP
service     → Regras de negócio
repository  → Comunicação com banco
model       → Entidades do sistema
```

---

## Relacionamento entre entidades

* Um usuário (**DataModel**) possui uma ação
* Uma ação (**ActionModel**) pode estar associada a vários usuários

### Tipo de relacionamento:

* ManyToOne (Data → Action)
* OneToMany (Action → Data)

---

## Como rodar o projeto

1. Clonar o repositório
2. Abrir no IntelliJ ou VS Code
3. Rodar a classe principal:

```
CadastroApiApplication.java
```

4. A API estará disponível em:

```
http://localhost:8080
```

---

## Testando com Postman

### ▶️ Criar ação

POST /actions

```json
{
  "action": "Correr",
  "description": "Correr durante 30 min"
}
```

---

### ▶️ Criar usuário

POST /data

```json
{
  "nome": "User Test",
  "email": "user_test00@email.com",
  "idade": 18
}
```

---

### ▶️ Atualizar usuário (associar ação)

PUT /data/1

```json
{
  "nome": "Pedro",
  "email": "pedro@email.com",
  "idade": 18,
  "action": {
    "id": 1
  }
}
```

---

### ▶️ Listar dados

GET /data
GET /actions

---

## ⚠️ Observações

* O banco H2 é em memória (dados são perdidos ao reiniciar)
* Para evitar loop infinito no JSON foi usado `@JsonIgnore`

---

