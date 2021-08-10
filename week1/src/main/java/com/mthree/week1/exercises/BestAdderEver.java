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
public class BestAdderEver {
    public static void main(String[] args) {
       int[] nums = {4, 5, 8};
       int result = 0;
       
       for(int i=0; i < nums.length; i++)
           result += nums[i];
       
       System.out.printf("%d + %d + %d = %d\n", nums[0], nums[1], nums[2], result);
       
    }
}
