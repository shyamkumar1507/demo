package com.example.demo;

public class FibinocciSeries {
    public static void main(String[] args) {
        int numberOfDigits = 10;

        for (int i=0; i<numberOfDigits; i++) {
            System.out.print(printFibinocciSeries(i) + " ");
        }
    }

    public static int printFibinocciSeries(int num) {
     if (num<=0) return 0;
     if (num ==1) return 1;

     return printFibinocciSeries(num-1) + printFibinocciSeries( num-2);
    }


}
