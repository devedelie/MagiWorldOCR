package com.elie.MagiWorldOCR;

public class Magus extends Character {
    protected int basicAttackFireball;
    protected int specialAttackCare;

    public Magus(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);


    }

    int levelFlag = level; // Keeps the original level value to compare when using Special Attack

    @Override
    public void BasicAttack(Character opponent, Character currentPlayer) {
        System.out.println("Fire-Ball!");
        opponent.vitality = opponent.vitality - currentPlayer.intelligence;
        System.out.println("Opponent current vitality = " + opponent.vitality + "\n");
    }

    @Override
    public void SpecialAttack(Character opponent, Character currentPlayer) {
        System.out.println("Care!");
        currentPlayer.vitality = currentPlayer.vitality + (currentPlayer.intelligence*2);
        if (currentPlayer.vitality > levelFlag)
            currentPlayer.vitality = levelFlag;
        System.out.println("You have cured yourself. Your new vitality is: " + currentPlayer.vitality);
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
