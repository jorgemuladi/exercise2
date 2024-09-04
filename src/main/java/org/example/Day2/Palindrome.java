package org.example.Day2;

public class Palindrome {

    public static boolean isPalindrome(String initialWord) {
        initialWord = initialWord.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = initialWord.length() - 1;

        while (left < right) {

            if (initialWord.charAt(left) != initialWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}