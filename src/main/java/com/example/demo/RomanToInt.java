package com.example.demo;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("C", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        String[] roman = s.split("");
        while(i < s.length()) {
            String currentSymbol = roman[i];
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if(i+1 < s.length()) {
                String nextSymbol = roman[i+1];
                nextValue = values.get(nextSymbol);
            }

            if(currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            } else {
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }
}
