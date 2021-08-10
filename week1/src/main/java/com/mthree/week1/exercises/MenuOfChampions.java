/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.week1.exercises;

/**
 *
 * @author ArmandoGonzalez
 */
public class MenuOfChampions {
    public static void main(String[] args) {
       String name = "Mando's";
       String[] items = {"sandwich", "pizza", "pop"};
       double[] prices = {3.50, 3.50, 1.50};
       
       displayDecoration();
       System.out.printf("WELCOME TO %s\n Today's menu is...\n\n", name);
       
       displayDecoration();
       for(int i=0; i<3; i++)
           System.out.printf("$ %f *** %s\n", prices[i], items[i]);
       
    }
    
    public static void displayDecoration(){
        for(int i=0; i<10; i++)
            System.out.print("*###");
        System.out.println("\n");
    }
}
