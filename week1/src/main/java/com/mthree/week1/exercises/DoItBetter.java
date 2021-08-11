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
public class DoItBetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] anwsers = new int[3];

        System.out.println("How many miles can you run?");
        anwsers[0] = Integer.parseInt(input.nextLine());
        System.out.printf("I can run %d miles!\n", anwsers[0]+1);
        
        System.out.println("How many hot dogs can you eat?");
        anwsers[1] = Integer.parseInt(input.nextLine());
        System.out.printf("I can eat %d hot dogs!\n", anwsers[1]+1);
        
        System.out.println("How many languages do you know?");
        anwsers[2] = Integer.parseInt(input.nextLine());
        System.out.printf("I know %d languages!\n", anwsers[2]+1);
    }
}
