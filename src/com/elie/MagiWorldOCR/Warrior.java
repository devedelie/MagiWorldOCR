package com.elie.MagiWorldOCR;

public class Warrior extends Character{
    protected int basicAttackSwordStrike;
    protected int specialAttackRageStrike;


    protected Warrior(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);

    }

    @Override
    public void BasicAttack(Character opponent, Character currentPlayer) {
        System.out.println("Sword Strike!\n");
        opponent.vitality = opponent.vitality - currentPlayer.strength;
        System.out.println("Opponent current vitality = " + opponent.vitality + "\n");
    }

    @Override
    public void SpecialAttack(Character opponent, Character currentPlayer) {
        System.out.println("Rage Strike!\n");
        opponent.vitality = opponent.vitality - (currentPlayer.strength*2);
        currentPlayer.vitality = currentPlayer.vitality - (currentPlayer.strength/2);
        System.out.println("Opponent current vitality = " + opponent.vitality + "\n");
        System.out.println("You have lost some power. Your new vitality is: " + currentPlayer.vitality + "\n");
    }



    @Override
    public String toString() {
        return name + ": Warrior " +
                ", Level = " + level + '\'' +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence ;
    }


}
