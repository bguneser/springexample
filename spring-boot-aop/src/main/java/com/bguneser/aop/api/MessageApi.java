package com.bguneser.aop.api;

import com.bguneser.aop.service.MessageService;
import com.bguneser.aop.service.SecondMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @Autowired
    private SecondMessageService secondMessageService;

    @PostMapping
    public ResponseEntity<String> sampleMethod (@RequestBody String message){
        secondMessageService.message(message);
        return ResponseEntity.ok(messageService.giveMessage(message));
    }
}
