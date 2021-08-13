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

        int age, maxRate;
        double start, end;
        
        System.out.println("What's your age? ");
        age = Integer.parseInt(input.nextLine());
        maxRate = 220 - age;
        start = 0.50 * maxRate;
        end = 0.8 * maxRate;
        System.out.printf("start: %f, end: %f, max rate: %d\n", start, end, maxRate);
    }
}
