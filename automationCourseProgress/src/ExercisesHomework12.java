package Exercises;

import java.util.Scanner;

public class ExercisesHomework12 {
    public static void main(String[] args) {
        //determineIsPositiveInt();
        //determineIsDivisibleBy23(12);
        //determineIsDivisibleBy26(89);
        determineDayOfTheWeek();
        //printSumOfNumbers(5);
        //printBiggestNumber();
        //printBiggestNumber();
        //determineIsPositiveFloat();
    }

    private static void determineIsPositiveInt() {
        //1. Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.nextLine());
        if (i > 0)
            System.out.println("Positive i");
        else if (i == 0)
            System.out.println("i=0");
        else
            System.out.println("Negative i");
    }

    public static void solveQuadraticEquation() {
        //2. Write a Java program to solve quadratic equations (use if, else if and else).
    }

    private static void printBiggestNumber() {
        //3. Take three numbers from the user and print the greatest number.
        System.out.println("Enter number 1:");
        Scanner num1 = new Scanner(System.in);
        int i1 = Integer.parseInt(num1.nextLine());
        System.out.println("Enter number 2:");
        Scanner num2 = new Scanner(System.in);
        int i2 = Integer.parseInt(num2.nextLine());
        System.out.println("Enter number 3:");
        Scanner num3 = new Scanner(System.in);
        int i3 = Integer.parseInt(num3.nextLine());
        if ((i1 > i2) && (i1 > i3))
            System.out.println("Number " + i1 + " is the biggest.");
        else if ((i2 > i1) && (i2 > i3))
            System.out.println("Number " + i2 + " is the biggest.");
        else
            System.out.println("Number " + i3 + " is the biggest.");
    }

    public static void determineIsPositiveFloat() {
        //4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        // Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
        // or "large" if it exceeds 1,000,000.
        System.out.println("Enter a number:");
        Scanner num = new Scanner(System.in);
        float i = Float.parseFloat(num.nextLine());
        float absI = Math.abs(i);
        if (i == 0)
            System.out.println("Number is zero");
        else if ((i > 0) && (i < 1))
            System.out.println("Number is small positive");
        else if ((i >= 1) && (i < 1000000))
            System.out.println("Number is positive");
        else if (i >= 1000000)
            System.out.println("Number is large positive");
        else if ((i < 0) && (absI < 1))
            System.out.println("Number is small negative");
        else if ((absI >= 1) && (absI <= 1000000))
            System.out.println("Number is negative");
        else
            System.out.println("Number is large negative");
    }

    public static void determineIsDivisibleBy23(int i) {
        if (i % 2 == 0)
            System.out.println("Number is divisible by 2");
        else if (i % 3 == 0)
            System.out.println("Number is divisible by 3");
        else
            System.out.println("Number is not divisible by 2 nor by 3");
    }

    public static void determineIsDivisibleBy26(int i) {
        if (i % 2 == 0)
            System.out.println("Number is divisible by 2");
        else if (i % 6 == 0)
            System.out.println("Number is also divisible by 6");
        else
            System.out.println("Number is not divisible by 2 nor by 6");
    }

    private static void determineDayOfTheWeek() {
        //5. Write a Java program that keeps a number from the user and
        // generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int d = Integer.parseInt(s.nextLine());
        switch (d) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    public static void printSumOfNumbers(int e) {
        int sum = 0;
        for (int i = 1; i <= e; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to " + e + " is: " + sum);
    }
}
