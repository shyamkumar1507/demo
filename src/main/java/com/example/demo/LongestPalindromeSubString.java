package com.example.demo;

public class LongestPalindromeSubString {

    public static void main(String[] args) {
            String str = "abba";
            System.out.println("Longest palindromic substring is: " + longestPalindromicSubString(str));
    }

    private static String longestPalindromicSubString(String str) {
        for (int length = str.length(); length > 0; length--) {
            for (int start = 0; start <= str.length()-length; start++) {
                if (check(str, start, start+length)) {
                    return str.substring(start, start+length);
                }
            }
        }
        return null;
    }
    private static boolean check(String str, int start, int end) {
        int left = start, right = end-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; right--;
        }
        return true;
    }
}
