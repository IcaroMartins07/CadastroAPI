package com.example.CadastroAPI.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DataController {

    @GetMapping("/dataRoute")

    public String DataRoute() {
        return "Essa e a minha primeira rota";
    }
}
