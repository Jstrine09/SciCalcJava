package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */


public class Console {

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = a - b;
        System.out.println(difference);
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return product;
    }

    public static int divide(int a, int b) {
        int quotient = a / b;
        System.out.println(quotient);
        return quotient;
    }



    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }
}


