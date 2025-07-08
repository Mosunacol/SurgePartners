package com.surgepartners.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class SwaggerRedirectController {

    @GetMapping("/doc")
    public String redirectToSwaggerUI(Model model) {
        return "redirect:/swagger-ui.html"; // Redirige al path predeterminado
    }
}
