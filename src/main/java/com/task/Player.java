package com.task;

public class Player {
    private final String title;
    private int health;
    private final int strength;
    private final int attack;

    public Player(String title, int health, int strength, int attack) {
        this.title = title;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getTitle() {
        return title;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void doDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
