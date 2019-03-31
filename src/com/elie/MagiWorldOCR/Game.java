package com.elie.MagiWorldOCR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    int playerNum = 1;  // Initiation of the variable that stores player number (1 or 2)
    Scanner sc = new Scanner(System.in);

    public void playerTurn(){


    }

    /**
     * A presentation of character selection to the player (Warrior / Magus / Rogue)
     * Also included, a loop to ensure that NO figures(below 1 and above 3) or letters are allowed.
     */

    public void characterSelectionMenu() {
        try {
            System.out.println("Player " + playerNum + " - Please select your character: \n ----------------------------- \n 1) Warrior \n 2) Magus \n 3) Rogue ");
             int playerCharacterChoice = sc.nextInt();
            if (playerCharacterChoice > 3 || playerCharacterChoice < 1) {
                System.out.println("Error! Please select a number between 1-3");
                characterSelectionMenu();
            } else {
                switch (playerCharacterChoice) {
                    case 1:
                        System.out.println("Your character is Warrior\n");
                        String typeOfCharacter = "Warrioir";
                        playerPerformancesSelection(typeOfCharacter);

                    case 2:
                        System.out.println("Your character is Magus\n");
                        typeOfCharacter = "Magus";
                        playerPerformancesSelection(typeOfCharacter);

                    case 3:
                        System.out.println("Your character is Rogue\n");
                        typeOfCharacter = "Rogue";
                        playerPerformancesSelection(typeOfCharacter);
                }
            }
        } catch (InputMismatchException e) {
            sc.next();
            System.err.println("Error! Letters are not allowed. Please select a number between 1-3");
            characterSelectionMenu();
        }
    }

}







