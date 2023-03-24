package com.fatec.loja.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
@Component
class Informatica {
    public static void exibir(ModelMap model) {

        model.addAttribute("titulo", "informatica");
    }
}