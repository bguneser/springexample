package com.bguneser;

import com.bguneser.model.Notification;
import com.bguneser.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitApplication {



    public static void main(String[] args) {

        SpringApplication.run(RabbitApplication.class,args);




    }
}
