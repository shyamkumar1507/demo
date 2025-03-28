package com.example.demo;

import java.util.*;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        Map<String, Integer> palindromeMap = new HashMap<>();
        Boolean tempIsPalindrome = true;
        String finalPalindrome;
        int n = s.length();
       for (int i =0; i<n;i++) {
           for (int j=i+1; j<=n-1;j++) {
               if (s.charAt(i) == s.charAt(j)) {
                   System.out.println("Possible pallindromes are: " + s.substring(i, j+1));
                   String subString = s.substring(i, j+1);
                   int left = 0, right = subString.length() -1;
                   while (left < right) {
                       if (subString.charAt(left) != subString.charAt(right)) {
                           tempIsPalindrome = false;
                           break;
                       }
                       left++;
                       right--;
                       tempIsPalindrome = true;
                   }
                   if (tempIsPalindrome) {
                       palindromeMap.put(s.substring(i,j+1), s.substring(i,j+1).length());
                   }
               }

           }
       }
        Set<String> palindromeStrings = palindromeMap.keySet();
        String longestString = palindromeStrings.stream()
                .max(Comparator.comparingInt(String::length)).orElse("");


    return longestString;
    }

    public static void main(String args[]) {
        String str = "abaabadcdbd1";
        String palindrome = longestPalindrome(str);
        System.out.println("Longest palindrom string is: "+ palindrome);
    }
}