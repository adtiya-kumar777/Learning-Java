package com.company;

import java.util.Scanner;

public class SumOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of three number is = " + sum);
    }
}
