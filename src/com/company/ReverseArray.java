package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {100, 30, 40, 65, 87};
        int n = arr.length;
        for(int i = n-1; i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
}
