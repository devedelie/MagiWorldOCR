package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {
    @Test
    public void Given_RogueBasicAttack_When_RequestTypeOfAttack_Then_CheckResult() {
        Rogue player = new Rogue("Player 1", 100, 33,33,33);
        Rogue opponent = new Rogue("Player 2", 100, 22,22,22);
        player.BasicAttack(opponent,player);
        assertEquals(467, opponent.getVitality()); // opponent damage
    }

    @Test
    public void Given_RogueSpecialAttack_When_RequestTypeOfAttack_Then_CheckResults() {
        Rogue player = new Rogue("Player 1", 100, 33,33,33);
        Rogue opponent = new Rogue("Player 2", 100, 22,22,22);
        player.SpecialAttack(opponent,player);
        assertEquals(83, player.getAgility());  // currentPlayer points increase
    }

}