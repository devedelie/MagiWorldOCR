package com.elie.MagiWorldOCR;

public class Warrior extends Character{
    protected int basicAttackSwordStrike;
    protected int specialAttackRageStrike;


    public Warrior(String name, int level, int vitality, int strength, int agility, int intelligence) {
        super(name, level, vitality, strength, agility, intelligence);

    }

    @Override
    public String toString() {
        return "Warrior:" +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }
}
