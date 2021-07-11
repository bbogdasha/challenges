package com.bogdan.task8;

public class PalindromeString {

    public static void main(String[] args) {

        String s1 = "Madam45_!*";
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = "race a car";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    private static boolean isPalindrome(String string) {
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString().equals(string);
    }
}
