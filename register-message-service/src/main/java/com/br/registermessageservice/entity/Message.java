package com.br.registermessageservice.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    
    private String name;
    private String email;
    private String messageBody;
    private LocalDateTime date;
}
