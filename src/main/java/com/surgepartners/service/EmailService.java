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
        email.setTo("monicantosuna@gmail.com"); // Correo destino actualizar con el final
        email.setSubject("Nuevo mensaje de: " + name);

        email.setText(
                "=== DATOS DEL FORMULARIO ===\n" +
                        "Nombre: " + name + "\n" +
                        "Email: " + fromEmail + "\n" +
                        "Empresa: " + (company != null ? company : "No especificada") + "\n" +
                        "Teléfono: " + (telephone != null ? telephone : "No proporcionado") + "\n\n" +
                        "Mensaje:\n" + message + "\n\n" +
                        "=== FIN DEL MENSAJE ==="
        );
        mailSender.send(email);
    }
}
