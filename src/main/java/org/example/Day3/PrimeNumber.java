package org.example.Day3;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        for (int i =2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
