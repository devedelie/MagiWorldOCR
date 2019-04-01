package com.elie.MagiWorldOCR;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    Character player1;
    Character player2;
    Character general; // Is used to set Player1 and Player2



    public void playersTurn() {
        player1 = characterSelectionMenu("Player 1 ", 0);
        player1 = general;
        player2 = characterSelectionMenu("Player 2 ",0);
        player2 = general;
        System.out.println("\n Fight begin!\n");
        do {
            


        }while (player1.vitality>0 && player2.vitality>0);
            if (player1.vitality<=0) {
                System.out.println("Player 2 win the game!");
            }else{
                System.out.println("Player 1 Win the game!");
            }
        System.out.println("Game is over. \n");
            System.exit(0);

    }


    int RequestValueForPlayerTurn (String text) {
        System.out.println(text);
        int value = 0;
        boolean valueTrigger;

        do {
            value = sc.nextInt();
            valueTrigger = true;

        } while (!valueTrigger);
        return value;
    }

    /**
     * A presentation of character selection menu to the player (Warrior / Magus / Rogue)
     * Also included, a loop to ensure that NO figures(below 1 and above 3) or letters are allowed.
     */
    Character characterSelectionMenu(String playerName, int characterNumber) {
        Character characterObject = null;

        try {
            System.out.println(playerName + " - Please select your character: \n ----------------------------- \n 1) Warrior \n 2) Magus \n 3) Rogue ");
             characterNumber = sc.nextInt();
            if (characterNumber > 3 || characterNumber < 1) {
                System.out.println("Error! Please select a number between 1-3");
                characterSelectionMenu(playerName, characterNumber);
            } else {
                switch (characterNumber) {
                    case 1:
                        System.out.println("Your character is Warrior\n");
                        playerPerformancesSelection(1, playerName);
                        break;
                    case 2:
                        System.out.println("Your character is Magus\n");
                        playerPerformancesSelection(2,playerName);
                        break;
                    case 3:
                        System.out.println("Your character is Rogue\n");
                        playerPerformancesSelection(3,playerName);
                        break;
                }
            }
        } catch (InputMismatchException e) {
            sc.next();
            System.err.println("Error! Letters are not allowed. Please select a number between 1-3");
            characterSelectionMenu(playerName, characterNumber);
        }
        return characterObject;
    }


    /**
     * Performances selection of the characters
     * @param typeOfCharacter defines the type of character (Warrior, Magus, Rogue)
     * @param playerName represent the player name (Player 1 / Player 2)
     * @return
     */

    Character playerPerformancesSelection(int typeOfCharacter, String playerName){
        Character characterObject= null;

        int  level, vitality, strength, agility, intelligence;
        String name = playerName;

        level = RequestValueMethodForPerformances("Choose your level between 1 - 100",100);
        System.out.println("Your level is : " + level +"\n");
        vitality = level * 5;
        System.out.println("Your vitality is : " + vitality +"\n");
        System.out.println("Your Strength + Agility + Intelligence cannot reach above your Level limit! Choose wisely ");
        strength = RequestValueMethodForPerformances("Choose your strength \n You have left " + level +" points", level);
        System.out.println("Your strength is : " + strength +"\n");
        agility = RequestValueMethodForPerformances("Choose your agility \n You have left only: " + (level - strength)+" points", (level - strength));
        System.out.println("Your agility is : " + agility +"\n");
        intelligence = RequestValueMethodForPerformances("Choose your intelligence \n You have left only: " + (level - strength - agility)+" points",(level - strength -agility));
        System.out.println("Your intelligence is : " + intelligence +"\n");

        switch(typeOfCharacter){
            case 1:
                characterObject = new Warrior(name, level, strength, agility, intelligence);
                System.out.println(characterObject+"\n");
                general = characterObject;
                break;
            case 2:
                characterObject = new Magus(name, level, strength, agility, intelligence);
                System.out.println(characterObject+"\n");
                general = characterObject;
                break;
            case 3:
                characterObject = new Rogue(name, level, strength, agility, intelligence);
                System.out.println(characterObject+"\n");
                general = characterObject;
                break;
        }
        return characterObject;
    }


    /**
     * A method to receive a value from the user, and to check if it is between the correct range
     * and also to verify the user is not exceeding the rule of (strength + agility + intelligence <= level)
     *
     * @param text  prints the instructions to the players
     * @param limitValue  keeps the rule of (strength + agility + intelligence <= level)
     * @return value of user's input
     */
    int RequestValueMethodForPerformances(String text, int limitValue) {
        System.out.println(text);
        int value;
        boolean valueTrigger=false;
        do {
            value = sc.nextInt();
            if (value > limitValue){
                System.out.println("The value selected is over the limit of points you've got. Please choose a lower value");
            }else {
                valueTrigger = true;
            }
        } while (!valueTrigger);
        return value;


    }
}







