package com.company;

public class Problems {

    static void pattern1(int n) {
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumOfNaturalNumbers(int n) {
        if(n==1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n-1);
    }

    static  void pattern2(int n) {
        for (int i=n; i>0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {

        // problem1 Pattern problem to print * ** *** ****
        pattern1(5);

        //problem-2
        System.out.println(sumOfNaturalNumbers(4));

        //problem 3 print a pattern **** *** ** *
        pattern2(5);

        //print nth fibonacci series
        System.out.println(fib(6));
    }
}
