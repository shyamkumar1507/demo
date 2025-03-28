package com.example.demo;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        for (int i = 0; i < k; i++) {
            int temp = intArray1[intArray1.length - 1];
            for (int j = intArray1.length - 1; j > 0; j--) {
                intArray1[j] = intArray1[j - 1];
            }
            intArray1[0] = temp;
        }
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print(intArray1[i] + " ");
        }
    }
}
