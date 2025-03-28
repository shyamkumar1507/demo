package com.example.demo;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10, y = 20, temp = 0;
        System.out.println("Swapping using three variables: ");
        System.out.println("Before swap x = " + x + ", y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap x = " + x + ", y = " + y);
        x = 10; y = 20;
        System.out.println("Swapping using two variables: ");
        System.out.println("Before swap x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x- y;
        System.out.println("After swap x = " + x + ", y = " + y);
    }
}
