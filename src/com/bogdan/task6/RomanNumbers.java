package com.bogdan.task6;

public class RomanNumbers {

    public static void main(String[] args) {
        System.out.println(toRomanNumber(9));
        System.out.println(toRomanNumber(22));
        System.out.println(toRomanNumber(58));
        System.out.println(toRomanNumber(101));
        System.out.println(toRomanNumber(1994));
    }

    public static String toRomanNumber(int number) {

        StringBuilder sb = new StringBuilder();
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}
