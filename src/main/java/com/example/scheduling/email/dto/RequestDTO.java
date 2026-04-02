package com.example.scheduling.email.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {

        private String recipientEmail;
        private String subject;
        private String body;

        // You can add more fields as needed, such as attachments, etc.
    }

