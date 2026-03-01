package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */

class Prompt {
    private String prompt;
    private String userInput;

    public Prompt(String prompt, String userInput) {
        this.prompt = prompt;
        this.userInput = userInput;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getUserInput() {
        return userInput;
    }
}
public class TestMainApplication {


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

}
