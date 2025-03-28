package com.example.demo;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to be reversed: ");
        String str = scanner.nextLine();

        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        System.out.println("String after appending to string buffer: " + str2);
        System.out.println(str2.reverse());
        char[]  charArray = new char[str.length()];
        for (int i = str.length()-1; i>0; i--) {
            charArray[-(i-str.length())] = str.charAt(i);
        }
        System.out.println(charArray);
    }
}
