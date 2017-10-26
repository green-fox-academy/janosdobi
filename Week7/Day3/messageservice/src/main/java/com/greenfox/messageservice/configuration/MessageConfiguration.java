package com.greenfox.messageservice.configuration;


import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    MessageService messageService(){
        return new EmailService();
    }

    @Bean
    MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }
}