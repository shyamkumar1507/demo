package com.example.demo;

public class FactorialCalculation {

    public static void main(String[] args) {
        int factorial = 3;
        System.out.println(printFactorial(factorial));
    }

    private static int printFactorial(int factorial) {
        if (factorial == 0) return 1;

        return factorial * printFactorial(factorial-1);
    }
}
