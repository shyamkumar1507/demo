package com.example.demo;

public class ArrayCountSolution {
    private static final int MOD = 1000000007;

    public int countArrays(int n, int k) {
        long result = 0;
        long totalChoices = 2 * k;

        for (int m=1; m<=n; m++) {
            long total = pow(totalChoices, m);
            long invalid = 0;
            int maxBits = (int) (Math.log(2*k)/Math.log(2)) + 1;
            for (int i=0; i<maxBits; i++) {
                int count = 0;
                for (int x=0; x<=2*k; x++) {
                    if ((x & (1<<i)) != 0) {
                        count++;
                    }
                }
                invalid = (invalid + pow(count, m)) % MOD;
            }
            result = (result + total - invalid + MOD) % MOD;
        }
        result = (result + 1) % MOD;
        return (int) result;
    }

    private long pow(long base, long exp) {
        long result = 1;
        base = base % MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayCountSolution solution = new ArrayCountSolution();
        System.out.println(solution.countArrays(2, 2));

    }
}
