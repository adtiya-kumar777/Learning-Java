package com.company;

import java.util.Scanner;

public class GreetUserByName {
    public static void main(String[] args) {
        System.out.println("Enter you name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello " + str + " have a nice day ");
    }
}
