/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mthree.week1.assignments;

/**
 *
 * @author ArmandoGonzalez
 */
public class SummativeSums {
    public static void main(String[] args){
        int[] list1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] list2 = { 999, -60, -77, 14, 160, 301 };
        int[] list3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 
            110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        printResult(1, sumList(list1));
        printResult(2, sumList(list2));
        printResult(3, sumList(list3));
    }
    
    //format print statement for result
    public static void printResult(int order, int result){
        System.out.printf("#%d Array Sum: %d\n", order, result);
    }
    
    //calculate sum for a list
    public static int sumList(int[] nums){
        int result = 0;
        for(int num: nums) result += num;
        return result;
    }
}
