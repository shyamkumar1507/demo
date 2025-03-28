package com.example.demo;

public class TowersOfHanoi {
    public static void solve(int n, char fromRod, char toRod, char auxRod) {
        if (n ==1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod "+ toRod);
            return;
        }
        solve(n-1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod "+ toRod);
        solve(n-1, auxRod, toRod, fromRod);
    }
    public static void main(String[] args) {
        int n =5;
        solve(n, 'A', 'B', 'C');
    }
}
