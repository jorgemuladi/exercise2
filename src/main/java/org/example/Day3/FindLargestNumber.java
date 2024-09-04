package org.example.Day3;

public class FindLargestNumber {
    public static int findLargestNumber(int[] array) {

        int largest = array[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
