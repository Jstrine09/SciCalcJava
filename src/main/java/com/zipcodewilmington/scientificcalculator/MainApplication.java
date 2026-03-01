package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */


public class MainApplication {
    
    public static int calculate(int a, int b, String operator) {
        int result = 5;
        switch (operator) {
            case "+":
                result = Console.add(a, b);
                break;
            case "-":
                result = Console.subtract(a, b);
                break;
            case "*":
                result = Console.multiply(a, b);
                break;
            case "/":
                result = Console.divide(a, b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }

    
    //     Console.println("");
    //     String s = Console.getStringInput("Enter a string");
    //     Integer i = Console.getIntegerInput("Enter an integer");
    //     Double d = Console.getDoubleInput("Enter a double");
    // }
    
    
    // public static void main(String[] args, Object userInput, Object prompt, String operator) {
        
    //     if (userInput instanceof String) {
    //         System.out.println();
    //         String userInputStr = Console.getStringInput(prompt);
    //         Console.println(userInputStr);
    //     } else if (userInput instanceof Integer) {
    //         System.out.println();
    //         Integer userInputInt = Console.getIntegerInput(prompt);
    //         Console.println(userInputInt);
    //     } else if (userInput instanceof Double) {
    //         System.out.println();
    //         Double userInputDbl = Console.getDoubleInput(prompt);
    //         Console.println(userInputDbl);
    //     }
    //     else {
    //         System.out.println("Invalid input type");
    //     }
    //     System.out.println(prompt);
    // }

    public static void main(String[] args) {
        boolean isRunning = true;

        String prompt = "Enter an operator (+, -, *, /): ";
        String operatorInput = Console.getStringInput(prompt);
        Integer num1Input = Console.getIntegerInput("Enter the first number: ");
        Integer num2Input = Console.getIntegerInput("Enter the second number: ");
        
        int result = calculate(num1Input, num2Input, operatorInput);
        Console.println("Result: %d", result);

        while (isRunning) {
        String again = Console.getStringInput("Use result in new equation? (yes/no): ");
        
        if (again.equalsIgnoreCase("no")) {
            isRunning = false;
        } else {
            String newOperator = Console.getStringInput("Enter an operator (+, -, *, /): ");
            Integer newNum = Console.getIntegerInput("Enter a number: ");
            result = calculate(result, newNum, newOperator);
            Console.println("Result: %d", result);
        }
    }
    Console.println("Thank you for using the calculator!");
}
}