package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void Given_IntValue_When_RequestValue_Then_CheckValueLimit() {
        Warrior player = new Warrior("Player 1", 100, 33,33,33);
        Warrior opponent = new Warrior("Player 2", 100, 22,22,22);
        player.BasicAttack(opponent);
        assertEquals(466, opponent.getVitality());
    }

}