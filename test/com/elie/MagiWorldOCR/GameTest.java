package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {

    }
    @Test
    public void Given_IntValue_When_RequestValue_Then_CheckValueLimit() {
        System.setIn(new ByteArrayInputStream(String.format("56%n").getBytes()));
        Game game = new Game();
        int value = game.RequestValueMethodForPerformances("Checking the value method", 90);
        assertEquals(56, value);
    }

    @Test
    public void Given_IntValue_When_RequestValue_Then_CheckBadValue_and_Then_CheckGoodValue() {
        System.setIn(new ByteArrayInputStream(String.format("86%n65%n").getBytes()));
        Game game = new Game();
        int value = game.RequestValueMethodForPerformances("Checking the value method", 70);
        assertEquals(65, value);
    }


}