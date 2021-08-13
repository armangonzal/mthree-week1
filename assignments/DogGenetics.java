/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mthree.week1.assignments;

import java.util.*;
/**
 * Find out your dog's genetic makeup
 * 
 * @author ArmandoGonzalez
 */
public class DogGenetics {
    public static void main(String[] args){
        String dogName = promptDogName();
        System.out.printf("%s is:\n", dogName);
        outputGenetics();
    }
    
    //returns user input for dog's name
    public static String promptDogName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        return sc.nextLine();
    }
    
    //generate percentages for each dog breed
    public static void outputGenetics(){
        int dnaLeft = 100;
        String[] breeds = {"St. Bernard", "Chihuahua", "Asian Pug", 
            "Pomerian", "Doberman"}; 
        int dnaPortion;
        for(String breed: breeds)
        {
            dnaPortion = getDnaPortion(dnaLeft);
            dnaLeft -= dnaPortion;
            System.out.printf("%d%% %s\n", dnaPortion, breed);
        }
    }
    
    public static int getDnaPortion(int dnaLeft){
        Random rnd = new Random();
        return rnd.nextInt(dnaLeft+1);
    }
}
