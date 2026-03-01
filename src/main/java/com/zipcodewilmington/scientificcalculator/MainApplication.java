package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */


public class MainApplication {
    
    public static double  calculate(double a, double b, String operator) {
        double result = 0;
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
            case "sqrt":
                result = (double) Console.squareRoot(a);
                break;
            case "sqr":
                result = (double) Console.square(a);
                break;
            case "inv":
                result = (double) Console.inverse(a);
                break;
            case "neg":
                result = (double) Console.invert(a);
                break;
            case "log":
                result = (double) Console.logarithm(a);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }


    public static void main(String[] args) {
        boolean isRunning = true;
        double result = 0.0;

        String prompt = "Enter an operator (+, -, *, /, sqrt, sqr, inv, neg, log): ";
        String operatorInput = Console.getStringInput(prompt);
        if (operatorInput.equals("sqrt") || operatorInput.equals("sqr") || operatorInput.equals("inv") || operatorInput.equals("neg") || operatorInput.equals("log")) {
            Double numInput = Console.getDoubleInput("Enter a number: ");
            result = calculate(numInput, 0, operatorInput);
            Console.println("Result: %f", result);
        } else {
            
        Double num1Input = Console.getDoubleInput("Enter the first number: ");
        Double num2Input = Console.getDoubleInput("Enter the second number: ");
        result = calculate(num1Input, num2Input, operatorInput);
        Console.println("Result: %f", result);
        }

        while (isRunning) {
        String again = Console.getStringInput("Use result in new equation? (yes/no): ");
        
        if (again.equalsIgnoreCase("no")) {
            isRunning = false;
        } else {
            String newOperator = Console.getStringInput("Enter an operator (+, -, *, /, sqrt, sqr, inv, neg, log): ");

            if (newOperator.equals("sqrt") || newOperator.equals("sqr") || newOperator.equals("inv") || newOperator.equals("neg") || newOperator.equals("log")) {
                result = calculate(result, 0, newOperator);
            } else {
                Double newNum = Console.getDoubleInput("Enter a number: ");
                result = calculate(result, newNum, newOperator);
            }
            Console.println("Result: %f", result);
        }
        }
        Console.println("Thank you for using the calculator!");
    }
}


//             String newOperator = Console.getStringInput("Enter an operator (+, -, *, /): ");
//             Double newNum = Console.getDoubleInput("Enter a number: ");
//             double newResult = calculate(result, newNum, newOperator);
//             result = newResult;