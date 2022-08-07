package com.company;

import java.util.Scanner;

class Subject {
    int max = 100;
    int obtd;
}

public class CalculatePercentage {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        System.out.println("Enter Maths marks");
        Scanner sc = new Scanner(System.in);
        s1.obtd = sc.nextInt();
        Subject s2 = new Subject();
        System.out.println("Enter English marks");
        s2.obtd = sc.nextInt();
        Subject s3 = new Subject();
        System.out.println("Enter Science marks");
        s3.obtd = sc.nextInt();
        Subject s4 = new Subject();
        System.out.println("Enter Hindi marks");
        s4.obtd = sc.nextInt();
        Subject s5 = new Subject();
        System.out.println("Enter History marks");
        s5.obtd = sc.nextInt();
        int totalMarksObtained = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        int percentage = totalMarksObtained * 100 / 500;
        System.out.println("Percentage obtained = " + percentage);
    }
}
