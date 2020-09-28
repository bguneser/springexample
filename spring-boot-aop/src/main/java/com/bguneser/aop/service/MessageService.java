package com.bguneser.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String giveMessage(String param){

        System.out.println("Method give message, param : "+param);
        return param;

    }
}
