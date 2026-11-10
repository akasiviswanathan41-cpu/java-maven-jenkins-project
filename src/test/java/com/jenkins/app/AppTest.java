package com.jenkins.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();

    @Test
    void testAddition() {
        assertEquals(30, app.add(10, 20));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, app.multiply(5, 4));
    }

    @Test
    void testGreeting() {
        assertEquals(
            "Welcome to Jenkins Maven Project!",
            app.greeting()
        );
    }
}
