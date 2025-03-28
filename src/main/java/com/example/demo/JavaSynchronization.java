package com.example.demo;


class Display {
    public void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning " + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    String name;
    Display d;
    public MyThread(String name, Display d) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
        Thread.yield();
    }
}
public class JavaSynchronization {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread("Ram", d);
        MyThread t2 = new MyThread("Shyam", d);
        t1.start();
        t2.start();
    }
}
