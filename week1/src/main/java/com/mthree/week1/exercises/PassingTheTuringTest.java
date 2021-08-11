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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, color, fruit;
        int num;

        System.out.println("Hello there!");
        
        System.out.println("What's your name? ");
        name = input.nextLine();
        System.out.printf("Hi %s! I'm Alice\n", name);
        
        System.out.println("What's your favorite color? ");
        color = input.nextLine();
        System.out.printf("Huh, %s? Mine's Electric Lime.\n\n", color);
        
        System.out.printf("I really like limes. They're my favorite fruit, too.\n" +
                "What's YOUR favorite fruit, %s?\n", name);
        fruit = input.nextLine();
        System.out.printf("Really? %s? That's wild!\n", fruit);
        
        System.out.println("Speaking of favorites, what's your favorite number?\n");
        num = Integer.parseInt(input.nextLine());
        
        System.out.printf("%d is a cool number. Mine's -7.\n", num);
        int p = -7 * num;
        System.out.printf("Did you know %d * -7 is %d? That's a cool number too!\n\n", num, p);
        
        System.out.printf("Well, thanks for talking to me, %s!", name);
    }

}
