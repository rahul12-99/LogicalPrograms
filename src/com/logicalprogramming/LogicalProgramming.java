package com.logicalprogramming;

import java.util.Scanner;

public class LogicalProgramming {
    public static void main(String[] args) {

        int num, reminder = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();

        while (num > 0){

            reminder = num % 10;
            System.out.print(reminder + " ");
            num = num/10;

        }

    }
}

