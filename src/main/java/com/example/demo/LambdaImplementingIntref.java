package com.example.demo;

public class LambdaImplementingIntref {
    public static void main(String args[]) {
        Interf i = () -> 2;
        int x = i.returnInt();
        System.out.println("returnd from lambda: " + x);
    }
}
