package org.example.Day2;

public class RemoveString {

    // Function to remove the first occurrence of the search string from the original string
    public static String removeFirstOccurrence(String original, String search) {
        // Find the index of the first occurrence of the search string
        int index = original.indexOf(search);

        // If the search string is found, remove it
        if (index != -1) {
            return original.substring(0, index) + original.substring(index + search.length());
        }

        // If the search string is not found, return the original string unchanged
        return original;
    }
}
