package com.bogdan.task2;

public class PrimitiveBinary {

    public static void main(String[] args) {
        String s1 = "house";
        String s2 = "intellijIDEA";
        System.out.println(converter(s2));
    }

    public static String converter(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] strToArray = s.toCharArray();
        for (char c : strToArray) {
            if (c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M') {
                stringBuilder.append("0");
            } else if (c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z') {
                stringBuilder.append("1");
            }
        }
        return stringBuilder.toString();
    }
}
