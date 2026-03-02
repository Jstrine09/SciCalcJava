package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */


public class Console {

    public static double add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static double subtract(double a, double b) {
        double difference = a - b;
        System.out.println(difference);
        return difference;
    }

    public static double multiply(double a, double b) {
        double product = a * b;
        System.out.println(product);
        return product;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Err");
        }

        double quotient = a / b;
        System.out.println(quotient);
        return quotient;
    }

    public static double square(double a) {
        double result = a * a;
        System.out.println(result);
        return result;
    }

    public static double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Err");
        }
        double result = Math.sqrt(a);
        System.out.println(result);
        return result;
    }

    public static double inverse(double a) {
        double result = 1 / a;
        System.out.println(result);
        return result;
    }

    public static double invert(double a) {
        double result = -a;
        System.out.println(result);
        return result;
    }

    public static double logarithm(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Err");
        }
        double result = Math.log(a);
        System.out.println(result);
        return result;
    }

    public static double exponent(double a, double b) {
        double result = Math.pow(a, b);
        System.out.println(result);
        return result;
    }

    public static double sine(double a) {
        double result = Math.sin(a);
        System.out.println(result);
        return result;
    }

    public static double cosine(double a) {
        double result = Math.cos(a);
        System.out.println(result);
        return result;
    }

    public static double tangent(double a) {
        double result = Math.tan(a);
        System.out.println(result);
        return result;
    }

    public static double inverseSine(double a) {
        double result = Math.asin(a);
        System.out.println(result);
        return result;
    }

    public static double inverseCosine(double a) {
        double result = Math.acos(a);
        System.out.println(result);
        return result;
    }

    public static double inverseTangent(double a) {
        double result = Math.atan(a);
        System.out.println(result);
        return result;
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


