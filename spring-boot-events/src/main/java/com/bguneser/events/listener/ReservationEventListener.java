package com.bguneser.events.listener;


import com.bguneser.events.ReservationCreatedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener   {

    @EventListener
   public void  reservationEventHandler(ReservationCreatedEvent reservationCreatedEvent) throws InterruptedException{

        Thread.sleep(5000L);
        System.out.println("Event Listener -> " + reservationCreatedEvent.getSource().toString());

    }


}
