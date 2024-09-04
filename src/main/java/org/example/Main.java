package org.example;

import org.example.Day2.EvenorOdd;
import org.example.Day2.Palindrome;
import org.example.Day2.RemoveString;
import org.example.Day2.TempConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Changes on my project");

        System.out.println("bug fixed for monster can't be damage");

        System.out.println("added new type of weapon: katana & saber");

        //Exercise 2
        System.out.println();
        System.out.println("Exercise 2");
        System.out.println();

        //Question 1
        System.out.println("Question1");

        Scanner scanner = new Scanner(System.in);

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
        }

    }
}
