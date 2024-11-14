package com.example.demo;

import java.util.*;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        Map<String, Integer> palindromeMap = new HashMap<>();
        Boolean tempIsPalindrome = true;
        String finalPalindrome;
        int n = s.length();
       for (int i =0; i<n;i++) {
           for (int j=i+1; j<=n;j++) {
               String subString = s.substring(i, j);
               int left = 0, right = subString.length() - 1;
               while (left < right) {
                   if (subString.charAt(left) != subString.charAt(right)) {
                       tempIsPalindrome = false;
                       break;
                   }
                   left++;
                   right--;
                   tempIsPalindrome = true;
               }

             //  boolean isPalindrom = checkIfPalindrome(s.substring(i,j));
               if (tempIsPalindrome) {
                   palindromeMap.put(s.substring(i,j), s.substring(i,j).length());
               }
           }
       }
        Set<String> palindromeStrings = palindromeMap.keySet();
        String longestString = palindromeStrings.stream()
                .max(Comparator.comparingInt(String::length)).orElse("");


    return longestString;
    }

//    private static boolean checkIfPalindrome(String substring) {
//        int left = 0;
//        int right = substring.length() - 1;
//
//        while (left < right) {
//            // Compare characters from left and right
//            if (substring.charAt(left) != substring.charAt(right)) {
//                return false; // Not a palindrome if characters don't match
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

    public static void main(String args[]) {
        String str = "abaabadcdbd1";
        String palindrome = longestPalindrome(str);
        System.out.println("Longest palindrom string is: "+ palindrome);
    }
}