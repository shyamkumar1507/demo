package com.example.demo;

public class ThreadsLambdaDemo1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i=0;i<10;i++) {
                System.out.println("From child Thread:" + i);
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++) {
            System.out.println("From main thread:" + i);
        }
    }
}
