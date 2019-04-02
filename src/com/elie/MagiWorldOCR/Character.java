package com.elie.MagiWorldOCR;

public abstract class Character {
        protected String name;
        protected int level;
        protected int vitality;
        protected int strength;
        protected int agility;
        protected int intelligence;


    public Character(String name, int level, int strength, int agility, int intelligence) {
        this.name = name;
        this.level = level;
        this.vitality = level *5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;

    }

    public abstract void BasicAttack(Character opponent, Character currentPlayer);

    public abstract void SpecialAttack(Character opponent, Character currentPlayer);

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getVitality() {
        return vitality;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
