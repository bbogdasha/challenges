package com.bogdan.task1;

import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        String s1 = "10 + (12 - 5)";
        String s2 = "10 + 2 - 5)";
        String s3 = "10 + ((2 - 5)";
        String s4 = "10 + ()2 - 5";
        String s5 = "10 + (2 - 5) + (20 + 2)";
        String s6 = "()";
        String s7 = "())";
        String s8 = "10 + (2 * (7 - 3 + (10 : 2) - 1)) + 100";
        String s9 = "10 + (2 * (7 - 3 + (10 : 2) - 1))) + 100";
        String s10 = "10 + ((2 * (7 - 3 + (10 : 2) - 1)) + 100";

        List<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);
        strings.add(s5);
        strings.add(s6);
        strings.add(s7);
        strings.add(s8);
        strings.add(s9);
        strings.add(s10);

        for (String s : strings) {
            System.out.println("String: " + s + "   ---> is valid? " + isValid(s));
        }
    }

    public static boolean isValid(String string) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current == '(') {
                stack.push(current);
            }

            if (current == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.peek();

                if (last == '(') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
