package com.company;

public class varArgs {
    static int sum(int ...arr){
        int result =0;
        for(int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("WELCOME to the  varArgs Tutorial");
        System.out.println("sum of 5 & 19 is : " +  sum(5,19));
        System.out.println("sum of 4 , 12 & 19 is : " +  sum(4,12,19));
        System.out.println("sum of 5 & 122 : " +  sum(5,122));
    }
}
