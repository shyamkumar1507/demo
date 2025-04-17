package com.example.demo;

import java.io.IOException;
import java.util.Stack;

public class ReversePolishNotation1 {

    private static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (operators.contains(token)) {
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                if (token.equals("+")) {
                    returnValue = left + right;
                } else if (token.equals("-")) {
                    returnValue = left - right;
                } else if (token.equals("*")) {
                    returnValue = left * right;
                } else if (token.equals("/")) {
                    returnValue = left / right;
                }
                stack.push(String.valueOf(returnValue));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) throws IOException {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }
}


