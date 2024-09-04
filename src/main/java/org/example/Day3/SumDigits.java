package org.example.Day3;

public class SumDigits {
    public static int calSumDigit(int num) {
        int sum = 0;

        while (num !=0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
