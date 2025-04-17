package com.example.demo;

import java.util.Scanner;

public class MinimumXAndMaxY {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        A = sc.nextInt();
        System.out.println("Enter the value of B:");
        B = sc.nextInt();
        System.out.println("Enter the value of C:");
        C = sc.nextInt();
        sc.close();

        Long P = (long) Math.pow(A, B);
        int rem = (int) (P % C);

        int X = (C-rem) % C;
        int Y = rem;

        System.out.printf("%d %d", X, Y);


    }
}
