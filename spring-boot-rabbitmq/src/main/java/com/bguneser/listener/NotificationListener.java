package com.bguneser.listener;

import com.bguneser.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "bguneser-queue")
    public void handleMessage(Notification notification){
        System.out.println("Message received");
        System.out.println(notification.toString());

    }
}
