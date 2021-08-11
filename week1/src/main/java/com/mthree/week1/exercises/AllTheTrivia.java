/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.week1.exercises;

import java.util.Scanner;
/**
 *
 * @author ArmandoGonzalez
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] anwsers = new String[4];

        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        anwsers[0] = input.nextLine();
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        anwsers[1] = input.nextLine();
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        anwsers[2] = input.nextLine();
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        anwsers[3] = input.nextLine();
        
        System.out.println();
        
        System.out.printf("Wow, 1,024 Gigabytes is a %s!\n", anwsers[3]);
        System.out.printf("I didn't know that the largest ever volcano was discovered on %s!\n", anwsers[2]);
        System.out.printf("That's amazing that %s is the most abundant element in the atmosphere...\n", anwsers[1]);
        System.out.printf("%s is the only planet that rotates clockwise, neat!\n", anwsers[0]);

    }
}
