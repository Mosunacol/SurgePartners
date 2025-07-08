package com.surgepartners.controller;

import com.surgepartners.service.EmailService;
import com.surgepartners.model.ContactForm; // Clase DTO para el formulario
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact") // Ruta base para TODOS los métodos del controlador
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping // Mapea a GET /contact (la ruta base)
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping // Mapea a POST /contact (la ruta base)
    public String submitContactForm(ContactForm contactForm) {
        emailService.sendContactEmail(
                contactForm.getEmail(),
                contactForm.getName(),
                contactForm.getCompany(),
                contactForm.getMessage(),
                contactForm.getTelephone()
        );
        return "redirect:/contact?success";
    }
}