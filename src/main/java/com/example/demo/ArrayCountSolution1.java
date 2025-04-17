package com.example.demo;

public class ArrayCountSolution1 {
    private static final int MOD = 1000000007;

    public int countArrays(int n, int k) {
        if (k < 0) return 0;
        long result = 0;
        int maxValue = 2 * k;
        for (int m = 1; m <= n; m++) {
            result = (result + countValid(m, maxValue)) % MOD;
        }
        return (int) ((result + 1) % MOD);
    }

    private long countValid(int m, int maxValue) {
        int[] arr = new int[m];
        return backtrack(arr, 0, maxValue);
    }

    private long backtrack(int[] arr, int index, int maxValue) {
        if (index == arr.length) {
            int and = arr[0];
            for (int i = 1; i < arr.length; i++) {
                and &= arr[i];
            }
            return and == 0 ? 1 : 0;
        }
        long count = 0;
        for (int i = 0; i <= maxValue; i++) {
            arr[index] = i;
            count = (count + backtrack(arr, index + 1, maxValue)) % MOD;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayCountSolution1 solution = new ArrayCountSolution1();
        System.out.println(solution.countArrays(2, 2));
    }
}
