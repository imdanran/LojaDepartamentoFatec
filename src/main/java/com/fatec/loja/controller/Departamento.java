package com.fatec.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Departamento {

    @GetMapping("/departamento/{nomeDep}")
    public String home(@PathVariable String nomeDep, ModelMap model) {
        if (nomeDep.equals("informatica")) {
            Informatica.exibir(model);
            return "informatica";
        } else {
            System.out.println("Inválido!");
            return "ERRO!!!";
        }
    }
}





