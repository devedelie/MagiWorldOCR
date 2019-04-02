package com.elie.MagiWorldOCR;

public class Rogue extends Character {
    protected int basicAttackArchery;
    protected int specialAttackConcentration;

    public Rogue(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);

    }

    /**
     * Rogue basic attack - opponent will lose a value equals to current player agility
     * @param opponent
     * @param currentPlayer
     */
    @Override
    public void BasicAttack(Character opponent, Character currentPlayer) {
        System.out.println("Archery!\n");
        opponent.vitality = opponent.vitality - currentPlayer.agility;
        System.out.println("Opponent current vitality = " + opponent.vitality + "\n");
    }

    /**
     * Rogue special attack - will increase current player agility by its own level divided by 2
     * @param opponent
     * @param currentPlayer
     */
    @Override
    public void SpecialAttack(Character opponent, Character currentPlayer){
        System.out.println("Concentration!\n");
        currentPlayer.agility +=  (currentPlayer.level/2);
        System.out.println("Your new agility level is = " + currentPlayer.agility + "\n");

    }

    @Override
    public String toString() {
        return name + ": Rogue " +
                ", Level = " + level + '\'' +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence ;
    }
}
