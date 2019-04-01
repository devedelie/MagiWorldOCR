package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void Given_WarriorBasicAttack_When_RequestTypeOfAttack_Then_CheckResult() {
        Warrior player = new Warrior("Player 1", 100, 33,33,33);
        Warrior opponent = new Warrior("Player 2", 100, 22,22,22);
        player.BasicAttack(opponent,player);
        assertEquals(467, opponent.getVitality()); // opponent damage
    }

    @Test
    public void Given_WarriorSpecialAttack_When_RequestTypeOfAttack_Then_CheckResults() {
        Warrior player = new Warrior("Player 1", 100, 33,33,33);
        Warrior opponent = new Warrior("Player 2", 100, 22,22,22);
        player.SpecialAttack(opponent,player);
        assertEquals(434, opponent.getVitality()); // opponent damage
        assertEquals(484, player.getVitality());  // currentPlayer damage
    }

}