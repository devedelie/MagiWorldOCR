package com.elie.MagiWorldOCR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagusTest {

    @Test
    public void Given_MagusBasicAttack_When_RequestTypeOfAttack_Then_CheckResult() {
        Magus player = new Magus("Player 1", 100, 33,33,33);
        Magus opponent = new Magus("Player 2", 100, 22,22,22);
        player.BasicAttack(opponent,player);
        assertEquals(467, opponent.getVitality()); // opponent damage
    }

    @Test
    public void Given_MagusSpecialAttack_When_RequestTypeOfAttack_Then_CheckResults() {
        Magus player = new Magus("Player 1", 25, 3,3,3);
        Magus opponent = new Magus("Player 2", 100, 22,22,22);
        player.SpecialAttack(opponent,player);
        assertEquals(125, player.getVitality());  // currentPlayer care
    }

}