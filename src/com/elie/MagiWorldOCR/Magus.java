package com.elie.MagiWorldOCR;

public class Magus extends Character {
    protected int basicAttackFireball;
    protected int specialAttackCare;
    int initialVitality;

    public Magus(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
        initialVitality = vitality; // Keeps the original level value to compare when using Special Attack
    }

    /**
     * Magus basic attack - opponent will lose a value equals to current player intelligence
     * @param opponent
     * @param currentPlayer
     */
    @Override
    public void BasicAttack(Character opponent, Character currentPlayer) {
        System.out.println("Fire-Ball!\n");
        opponent.vitality = opponent.vitality - currentPlayer.intelligence;
        System.out.println("Opponent current vitality = " + opponent.vitality + "\n");
    }

    /**
     * Magus Special attack - will increase current player vitality by 2 times its intelligence
     * In case where the actual vitality is higher than the initial vitality, the code will set the initial vitality
     * @param opponent
     * @param currentPlayer
     */
    @Override
    public void SpecialAttack(Character opponent, Character currentPlayer) {
        System.out.println("Care!\n");
        currentPlayer.vitality = currentPlayer.vitality + (currentPlayer.intelligence*2);
        if (currentPlayer.vitality > initialVitality){
            currentPlayer.vitality = initialVitality;
        }
        System.out.println("You have cured yourself. Your new vitality is: " + currentPlayer.vitality + "\n");
    }

    @Override
    public String toString() {
        return name + ": Magus " +
                ", Level = " + level + '\'' +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence;
    }
}
