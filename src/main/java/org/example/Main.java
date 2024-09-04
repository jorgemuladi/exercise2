package org.example;

import org.example.Day2.EvenorOdd;
import org.example.Day2.Palindrome;
import org.example.Day2.RemoveString;
import org.example.Day2.TempConversion;
import org.example.Day3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* System.out.println("Hello world!");
        System.out.println("Changes on my project");
        System.out.println("bug fixed for monster can't be damage");
        System.out.println("added new type of weapon: katana & saber");*/

        Scanner scanner = new Scanner(System.in);

        /*//Exercise 2
        System.out.println();
        System.out.println("Exercise 2");
        System.out.println();

        //Question 1
        System.out.println("Question1");



        System.out.println("Enter fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celcius = (fahrenheit - 32) * 5/9;

        System.out.printf("Temperature in Celsius: %.2f%n", celcius);


        //Question 2
        System.out.println("Question2");

        System.out.println("Enter distance in centimeter: ");
        double cm = scanner.nextDouble();

        double km = cm / 100000;

        System.out.printf("Distance in kilometer: " + km);
        System.out.println();


        //Question 3
        System.out.println("Question3");

        System.out.println("Enter an integer: ");

        int number = scanner.nextInt();

        if (EvenorOdd.isOdd(number)){
            System.out.printf(number + " is odd (TRUE)");
        }
        else {
            System.out.printf(number + " is even (FALSE)");
        }
        System.out.println();

        //Question 4
        System.out.println("Question4");

        System.out.println("Enter string: ");
        String string = scanner.nextLine();

        System.out.println("Enter words to remove from strings: ");
        String remove = scanner.nextLine();

        String result = RemoveString.removeFirstOccurrence(string, remove);

        System.out.println("Result: " + result);

        //Question 5
        System.out.println("Enter words: ");
        String inputWords = scanner.nextLine();

        boolean checkPalindrome = Palindrome.isPalindrome(inputWords);

        if (checkPalindrome) {
            System.out.println(inputWords + " is a polindrome.");
        }
        else {
            System.out.println(inputWords + " is not a polindrome.");
        }*/

        //Exercise 3

        //Question 1
        System.out.println("Question 1");
        System.out.println("Enter integers to be added: ");
        int enterDigit = scanner.nextInt();
        int sum = SumDigits.calSumDigit(enterDigit);
        System.out.println("the sum of entered digits is: " + sum);


        //Question 2
        System.out.println("Question 2");

        System.out.println("Prime number checker: " );
        int primeNumber = scanner.nextInt();

        boolean isPrime = PrimeNumber.isPrime(primeNumber);

        if (isPrime) {
            System.out.println(primeNumber + " is a prime number");
        }
        else {
            System.out.println(primeNumber + " is not a prime number");
        }

        //Question 3
        System.out.println("Question 3");
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest element in the array
        int largest = FindLargestNumber.findLargestNumber(array);

        // Display the result
        System.out.println("The largest element in the array is: " + largest);

        //Question 4
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter an operator (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Variable to store the result
        double result = 0;

        // Perform the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program
        }
        // Display the result
        System.out.println("The result is: " + result);

        //Question 5: Reverse a String
        System.out.println("Question 5");
        System.out.print("Enter a string to reverse: ");
        String input5 = scanner.nextLine();
        String reversedString = ReverseString.reverseString(input5);
        System.out.println("Reversed string: " + reversedString);

        //Question 6: Fibonacci Sequence
        System.out.println("Question 6");
        System.out.print("Enter the number of terms: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        Fibonacci.generateFibonacci(a);
        System.out.println();

        //Question 7
        System.out.println("Question 7");
        System.out.print("Enter a string: ");
        String vowelinput = scanner.nextLine();
        int vowelCount = CountVowel.countVowel(vowelinput);
        System.out.println("Number of vowels: " + vowelCount);

        //Question 8
        System.out.println("Question 8");
        System.out.print("Enter the number of elements: ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create an array of size n
        int[] array6 = new int[b];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < b; i++) {
            array6[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("Original array:");
        BubbleSort.printArray(array6);

        // Perform Bubble Sort
        BubbleSort.bubbleSort(array6);

        // Print the sorted array
        System.out.println("Sorted array:");
        BubbleSort.printArray(array6);
        scanner.nextLine();

        //Question 9
        System.out.println("Question 9");
        System.out.println("input first string: ");
        String str1 = scanner.nextLine();
        System.out.println("input second string: ");
        String str2 = scanner.nextLine();
        // Check if the strings are anagrams
        boolean result9 = Anagram.areAnagrams(str1, str2);
        // Display the result
        System.out.println("Are the strings anagrams? " + result9);

        //Question 10
        System.out.println("Question 10");
        System.out.print("Enter the number of elements: ");
        int y = scanner.nextInt();

        if (y < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Create an array of size n
        int[] newarray = new int[y];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < y; i++) {
            newarray[i] = scanner.nextInt();
        }

        // Find the second smallest element
        Integer secondSmallest = SecondSmallest.findSecondSmallest(newarray);

        // Display the result
        if (secondSmallest != null) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("Array does not have a second distinct smallest element.");
        }

        scanner.close();

    }
}
