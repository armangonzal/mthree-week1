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
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;

        System.out.println("Hello there!");
        
        System.out.println("What's your name? ");
        name = input.nextLine();
        System.out.printf("Hi %s! I'm Alice\n", name);
    }
}
