package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss b1 = new Boss(200,360);

        b1.setBossWeapon(ChooseWeapon.SWORD);
        System.out.println(b1.printinfo());

        Skeleton s1 = new Skeleton(230,350,ChooseWeapon.KNIFE,6);
        System.out.println(s1.printinfo());
        
        Skeleton s2 = new Skeleton(234,500,ChooseWeapon.BOW,2);
        System.out.println(s2.printinfo());


    }
}
