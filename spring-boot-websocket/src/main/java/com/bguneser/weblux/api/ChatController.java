package com.bguneser.weblux.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class ChatController {

    //bununla mesajı kendim özelleştirip gönderiyorum
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping ("/chat") // kullanıcı dışardan /chat uzantısı ile geliyor
    @SendTo("/topic") // bu durumda gelen tüm mesajlar tüm kullanıcılara gidiyor
    @SendToUser ()
    public void chatEndPoint (@Payload WsMessage wsMessage){

        System.out.println(wsMessage);

        messagingTemplate.convertAndSend("/topic",wsMessage);
    }




}
