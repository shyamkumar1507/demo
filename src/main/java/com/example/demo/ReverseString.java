package com.example.demo;

public class ReverseString {

    public static void main(String[] args) {
        String str = "hello";
        if (str == null) {
            System.out.println("Empty string is not allowed");
        }
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }
}
