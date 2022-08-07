package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of these number is = ");
        System.out.println(sum);
    }
}
