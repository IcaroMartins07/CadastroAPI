package com.example.CadastroAPI.Actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ActionController {

    @GetMapping("/action_route")
    public String ActionRoute() {
        return "Essa e a minha segunda rota";
    }
}
