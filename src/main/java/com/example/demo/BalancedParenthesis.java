package com.example.demo;

import java.util.Stack;

public class BalancedParenthesis {
    public static Boolean isBalance(String ps) {
        Stack<Character> chStack = new Stack<>();

        for (Character ch : ps.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                chStack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (chStack.isEmpty() || !isMatching(chStack.pop(), ch)) {
                    return false;
                }
            }
        }
        return chStack.isEmpty();
    }
    public static Boolean isMatching(Character open, Character close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
    public static void main(String[] args) {
        String checkPS = "{[()]}()";
        System.out.println("The given string is balanced: " + isBalance(checkPS));

        }
}
