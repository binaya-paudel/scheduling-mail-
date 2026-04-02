package com.example.scheduling.email.controller;

import com.example.scheduling.email.dto.RequestDTO;
import com.example.scheduling.email.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Service emailService;
    private RequestDTO request;

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail() {
        // Call the email service to send an email
        emailService.sendEmail(request.getRecipientEmail(), request.getSubject(), request.getBody());
        return ResponseEntity.ok("Email sent successfully");
    }
}