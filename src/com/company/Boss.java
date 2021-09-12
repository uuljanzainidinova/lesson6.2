package com.company;

public class Boss extends GameEntity {
    private ChooseWeapon bossWeapon;

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Boss(int health, int damage, ChooseWeapon bossWeapon) {
        super(health, damage);
        this.bossWeapon = bossWeapon;
    }

    public ChooseWeapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(ChooseWeapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printinfo() {
        return "Health: " + getHealth()+ " Damage "+ getDamage() +" Boss weapon "+ bossWeapon;
    }


}
