package com.example.springamqp.aula1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "orders.v1.order-created.send-notification")
    public void onOrderCreated(OrderCreatedEvent event){
        System.out.println("Id Recebido: "+ event.getId());
        System.out.println("Valor Recebido: "+ event.getValue());

    }
}
