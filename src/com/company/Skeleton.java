package com.company;

public class Skeleton extends Boss{
    private int countOfArrows;

    public Skeleton(int health, int damage, ChooseWeapon bossWeapon, int countOfArrows) {
        super(health, damage, bossWeapon);
        this.countOfArrows = countOfArrows;
    }

    public int getCountOfArrows() {
        return countOfArrows;
    }

    public void setCountOfArrows(int countOfArrows) {
        this.countOfArrows = countOfArrows;
    }

    @Override
    public String printinfo() {
        return super.printinfo()+ " count of arrows "+countOfArrows;
    }
}
