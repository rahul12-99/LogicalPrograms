package com.logicalprogramming;

import java.util.Scanner;

public class LogicalProgramming {
    public static void main(String[] args) {

        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

}

