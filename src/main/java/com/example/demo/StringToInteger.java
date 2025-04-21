package com.example.demo;

public class StringToInteger {
    public int myAtoi(String s) {

        String trimmedString = s.trim();
        Character firstChar = trimmedString.charAt(0);
        int num = 0;
        String subString = removeLeadingZeros(trimmedString.substring(1, trimmedString.length()));

        int iteration = 0;
        for(Character c: subString.toCharArray()) {

                if(Character.isDigit(c)) {
                    if(num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if(num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    int digit = subString.charAt(iteration) - '0';
                    num = num*10 + Integer.parseInt(c.toString());
            } else {
                break;
            }
            iteration++;
        }

        if(Character.isDigit(firstChar)) {
            num = num + ((int) Math.pow(10, iteration) * Integer.parseInt(firstChar.toString()));
        } else if(firstChar.toString().equals("-")) {
            num *= -1;
        }

        return num;

    }

    public static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+(?!$)", "");
    }
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("-91283472332"));
    }
}
