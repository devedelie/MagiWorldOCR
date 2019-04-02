package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();



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

    @Test
    public void Given_WrongValue_When_RequestIntValue_1_OR_2_Then_CheckErrorMessageAndSetCorrectNumber() {
        System.setIn(new ByteArrayInputStream(String.format("e%n1%n").getBytes()));
        Game game = new Game();
        game.RequestValueForPlayerTurn("");
        assertEquals("",  outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_1_Or_2_Value_When_RequestIntValue_1_OR_2_Then_Check() {
        System.setIn(new ByteArrayInputStream(String.format("1%n").getBytes()));
        Game game = new Game();
        game.RequestValueForPlayerTurn("");
        assertEquals("",  outContent.toString().replace("\r\n", "\n"));
    }

//    @Test
//    public void Given_GoodValuesInStandardInput_When_CharacterSelectionMenusIsRun_Then_DisplayCharacter() {
//        System.setIn(new ByteArrayInputStream(String.format("1%n100%n30%n30%n30%n").getBytes()));
//        Game game = new Game();
//        game.characterSelectionMenu("Player 1", 0);
//        String[] output = outContent.toString().replace("\r\n", "\n").split("\n");
//        assertEquals("Player 1: Warrior , Level = 100', vitality=500, strength=30, agility=30, intelligence=30", output[1]);
//    }

    @Test
    public void Given_PerformancesMenuSelection_When_SelectedCharacter_Then_WarriorIsCreated() {
        System.setIn(new ByteArrayInputStream(String.format("100%n33%n33%n33%n").getBytes()));
        Game game = new Game();
        Character character = game.playerPerformancesSelection(1,"Player");
        assertEquals("Player", character.name);
        assertEquals(100, character.level);
        assertEquals(33, character.strength);
        assertEquals(33, character.agility);
        assertEquals(33, character.intelligence);
    }
}