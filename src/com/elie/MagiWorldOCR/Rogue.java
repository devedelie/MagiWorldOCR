package com.elie.MagiWorldOCR;

public class Rogue extends Character {
    protected int basicAttackArchery;
    protected int specialAttackConcentration;

    public Rogue(String name, int level, int vitality, int strength, int agility, int intelligence) {
        super(name, level, vitality, strength, agility, intelligence);

    }

    @Override
    public String toString() {
        return name + ": Rogue " +
                ", Level = " + level + '\'' +
                ", vitality=" + vitality +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }
}
