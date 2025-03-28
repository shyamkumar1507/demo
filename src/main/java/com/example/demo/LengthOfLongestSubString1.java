package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int len = findLength(str);
        System.out.println("Length of longest substring is: " + len);
    }
    public static int findLength(String str) {
        int start=0; int end=0; int maxLen=1;
        Set<Integer> lengthSet = new HashSet<>();
        for (int i=0;i<str.length()-1; i++) {
            if (str.charAt(start) == str.charAt(i+1)) {
                start= i;
                lengthSet.add(maxLen);
                maxLen = 0;
            } else {
                maxLen = maxLen+1;
            }
        }
        if (lengthSet.isEmpty()) {
            lengthSet.add(maxLen);
        }
        return lengthSet.stream().max(Integer::compare).orElse(0);
    }
}
