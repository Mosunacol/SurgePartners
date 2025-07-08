package com.surgepartners.model;

import lombok.Data;

@Data

public class ContactForm {
    private String name;
    private String company;
    private String email;
    private String message;
    private String telephone;

    // Getters y Setters (usa Lombok @Data si lo prefieres)
}
