package com.elie.MagiWorldOCR;

public class Magus extends Character {
    protected int basicAttackFireball;
    protected int specialAttackCare;

    public Magus(String name, int level, int vitality, int strength, int agility, int intelligence) {
        super(name, level, vitality, strength, agility, intelligence);

    }

    @Override
    public String toString() {
        return "Magus{" +
                "basicAttackFireball=" + basicAttackFireball +
                ", specialAttackCare=" + specialAttackCare +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }
}
