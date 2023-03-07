package com.logicalprogramming;

import java.util.Scanner;

public class LogicalProgramming {

    public  static int randomGenerator(int size){
        return (int)(Math.floor(Math.random() * size)+ 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int random;
        System.out.println("Kindly enter the total number of coupons to generate");
        number = sc.nextInt();
        int[] coupons = new int[number];
        for (int i = 0; i < number; i++) {
            random = randomGenerator(number);           //store random number by calling
            coupons[i] = random;                        //add random no in array
            for (int j = 0; j < i; j++) {
                if (coupons[i] == coupons[j]) {
                    i--;                               //Be on same index until unique number
                }
            }
        }
        for (int i:coupons) {
            System.out.println(i);
        }
    }
}





