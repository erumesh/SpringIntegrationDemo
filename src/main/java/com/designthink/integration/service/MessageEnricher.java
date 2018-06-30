package com.designthink.integration.service;

import org.springframework.messaging.Message;

public class MessageEnricher {

    public void enrichMessage(Message<String> message){

        System.out.println("The Header of the Message" + message.getHeaders());

        System.out.println("The Payload of the Message" + message.getPayload());
    }
}


