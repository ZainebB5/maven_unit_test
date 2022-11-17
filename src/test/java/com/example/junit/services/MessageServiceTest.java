package com.example.junit.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {

    private final MessageService service = new MessageService();

    @DisplayName("Testing get() method of MessageService ") //optionneel
    @Test // verplicht
    void shouldSucceedOnreturningHelloJunit() {
        // actual value
        // expected value

        String expected = "Hello JUnit5 ";
        String actual = service.get();

        // Assertion is een  utility klass -  helperklass
        assertEquals(expected, actual);


    }

    @Test
    void shouldSucceedWhenMessageContentHasLessThan3Chars() {

         Executable instruction = () -> {
             service.sendMessage("ab");
         };

        assertThrows(ContentLenghtException.class , instruction);
    }
    @Test
    void shouldFailWhenMessageIsNull() {

        Executable instruction = () -> {
            service.sendMessage(null);
        };

        assertThrows(NullPointerException.class, instruction);
    }
}