package org.example.Day3;

public class ReverseString {

    public static String reverseString(String str) {
        char[] reversed = new char[str.length()];

        // Loop through the original string from the end to the beginning
        for (
                int i = 0; i < str.length(); i++) {
            // Copy characters from the end of the original string to the beginning of the new array
            reversed[i] = str.charAt(str.length() - 1 - i);
        }

        // Convert the character array back to a string
        return new String(reversed);

    }


}
