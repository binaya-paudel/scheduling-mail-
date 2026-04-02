package com.example.scheduling.email.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final JavaMailSender mailSender;

    public void sendEmail(String to, String subject, String body) {
        // Implement email sending logic using mailSender
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.MINUTES)
    public void scheduledEmailTask(){
        sendEmail(
                "test@example.com",
                "Scheduled Email",
                "This is an automated email sent every 10 minutes."
        );
        System.out.println("Scheduled email sent successfully");
    }
}



