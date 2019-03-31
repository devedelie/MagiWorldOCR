package com.elie.MagiWorldOCR;

public abstract class Character {
        protected String name;
        protected int level;
        protected int vitality;
        protected int strength;
        protected int agility;
        protected int intelligence;


    public Character(String name, int level, int vitality, int strength, int agility, int intelligence) {
        this.name = name;
        this.level = level;
        this.vitality = level *5;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }


}
