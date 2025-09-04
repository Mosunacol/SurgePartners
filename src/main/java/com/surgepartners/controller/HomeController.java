package com.surgepartners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";  // Renderiza home.html
    }

    @GetMapping("/about")
    public String about() {
        return "about";  // Renderiza about.html
    }


    @GetMapping("/revisoria_fiscal")
    public String revisoriaFiscal() {
        return "revisoria_fiscal";  // Renderiza revisoria_fiscal.html
    }

    @GetMapping("/asesoria_tributaria")
    public String asesoriaTributaria() {
        return "asesoria_tributaria";  // Renderiza asesoria_tributaria.html
    }

    @GetMapping("/auditoria_externa")
    public String auditoriaExterna() {
        return "auditoria_externa";  // Renderiza auditoria_externa.html
    }

    @GetMapping("/asesoria_contable")
    public String asesoriaContable() {
        return "asesoria_contable";  // Renderiza asesoria_contable.html
    }

}
