package com.surgepartners.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendContactEmail(String fromEmail, String name, String company, String message, String telephone) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("contacto@surgepartners.com"); // Correo destino actualizar con el final
        email.setSubject("Nuevo mensaje de: " + name);

        email.setText(
                "Email: " + fromEmail + "\n" +
                        "Empresa" + company + "\n" +
                        "Teléfono: " + telephone + "\n\n" +
                        "Mensaje:\n" + message
        );

        mailSender.send(email);
    }
}
