package com.example.junit.services;

public class MessageService {

    public String get(){
        return "Hello JUnit5 ";
    }

    public void sendMessage(String message) throws ContentLenghtException{
        if (message == null){
            throw new NullPointerException("Message can't be null !");

        }else if (message.isBlank() || message.length() < 3){
            throw new ContentLenghtException("Message can't have less than 3 characters ! ");
        }
        else if ( message.length() < 193){
            throw new ContentLenghtException("Message can't have more than 193 characters ! ");
        }
        System.out.println("Sending message : " + message);
    }
}
