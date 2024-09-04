package org.example.Day3;

public class SecondSmallest {
    public static Integer findSecondSmallest(int[] array) {
        // Handle edge case where the array is too small
        if (array.length < 2) {
            return null;
        }

        // Initialize the smallest and second smallest elements
        Integer smallest = null;
        Integer secondSmallest = null;

        for (int num : array) {
            if (smallest == null || num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num != smallest && (secondSmallest == null || num < secondSmallest)) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
