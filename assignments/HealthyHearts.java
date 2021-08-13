/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.week1.assignments;

import java.util.*;
/**
 * Find target heart rate base on age
 * 
 * @author ArmandoGonzalez
 */
public class HealthyHearts {
    public static void main(String[] args){
        int age = promptUserAge();
        int mhr = 220 - age; 
        int tmin = (int) (0.5 * mhr);
        int tmax = (int) (0.85 * mhr);
        System.out.printf("Your maxium heart rate should be %d beats per minute\n", 
                mhr);
        System.out.printf("Your target HR Zone is %d - %d beats per minute\n", 
                tmin, tmax);
    }
    
    //returns user input for age
    public static int promptUserAge(){
        System.out.println("What is your age?");
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age > 1 && age < 120) return age;
            else return promptUserAge();
        }
        catch(NumberFormatException nfe){
            return promptUserAge();
        }
    }
}
