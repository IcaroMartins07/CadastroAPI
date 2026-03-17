package com.example.CadastroAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DataController {

    @GetMapping("/boasVindas")

    public String BoasVindas() {
        return "Essa e a minha primeira rota";
    }
}
