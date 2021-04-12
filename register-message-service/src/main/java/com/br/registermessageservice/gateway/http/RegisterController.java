package com.br.registermessageservice.gateway.http;

import com.br.registermessageservice.gateway.dto.MessageDto;
import com.br.registermessageservice.gateway.form.MessageForm;
import com.br.registermessageservice.service.RegisterMessageService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    
    private RegisterMessageService registerMessageService;

    public RegisterController(RegisterMessageService registerMessageService) {
        this.registerMessageService = registerMessageService;
    }

    @PostMapping
    public ResponseEntity<MessageDto> sendMessage(MessageForm form) {
        return ResponseEntity.ok().body(this.registerMessageService.execute(form));
    }
}
