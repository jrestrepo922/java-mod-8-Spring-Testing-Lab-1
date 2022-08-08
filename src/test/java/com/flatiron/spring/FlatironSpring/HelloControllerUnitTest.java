package com.flatiron.spring.FlatironSpring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    private HelloController helloController;

    @BeforeEach
    void init(){
        this.helloController = new HelloController();
    }

    @Test
    void hello() {

        String name = "Jamie";
        assertEquals("Hello " + name, helloController.hello(name));
    }

    @Test
    void reverseUppercase(){
        String funkyString = "HI";
        assertEquals("IH", helloController.reverse(funkyString));
    }

    @Test
    void reverseLowercase(){
        String funkyString = "hi";
        assertEquals("ih", helloController.reverse(funkyString));
    }

    @Test
    void reverseMixedCase(){
        String funkyString = "Hi";
        assertEquals("iH", helloController.reverse(funkyString));
    }

    @Test
    void reverseSpaces(){
        String funkyString = "h i";
        assertEquals("i h", helloController.reverse(funkyString));
    }

    @Test
    void reverseNumbers(){
        String funkyString = "hi3";
        assertEquals("3ih", helloController.reverse(funkyString));
    }
}