package com.timbuchalka;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
