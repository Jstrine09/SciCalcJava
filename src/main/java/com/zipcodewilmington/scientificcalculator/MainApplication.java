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
            case "exp":
                result = (double) Console.exponent(a, b);
                break;
            case "sin":
                result = (double) Console.sine(a);
                break;
            case "cos":
                result = (double) Console.cosine(a);
                break;
            case "tan":
                result = (double) Console.tangent(a);
                break;
            case "asin":
                result = (double) Console.inverseSine(a);
                break;
            case "acos":
                result = (double) Console.inverseCosine(a);
                break;
            case "atan":
                result = (double) Console.inverseTangent(a);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }


    public static void main(String[] args) {
        boolean isRunning = true;
        double result = 0.0;
        double memory = 0.0;
        double prevA = 0.0;
        double prevB = 0.0;
        String prevOperator = "";

        String prompt = "Enter an operator (+, -, *, /, sqrt, sqr, inv, neg, log, exp, sin, cos, tan, mr, cv, mc): ";
        String operatorInput = Console.getStringInput(prompt);
        if (operatorInput.equals("sqrt") || operatorInput.equals("sqr") || operatorInput.equals("inv") || operatorInput.equals("neg") || operatorInput.equals("log") || operatorInput.equals("sin") || operatorInput.equals("cos") || operatorInput.equals("tan")) {
            Double numInput = Console.getDoubleInput("Enter a number: ");
            prevA = numInput;
            prevB = 0.0;
            prevOperator = operatorInput;
            result = calculate(numInput, 0, operatorInput);
            Console.println("Result: %f", result);
        } else {
            Double num1Input = Console.getDoubleInput("Enter the first number: ");
            Double num2Input = Console.getDoubleInput("Enter the second number: ");
            prevA = num1Input;
            prevB = num2Input;
            prevOperator = operatorInput;
            result = calculate(num1Input, num2Input, operatorInput);
            Console.println("Result: %f", result);
        }

        while (isRunning) {
        String again = Console.getStringInput("Use result in new equation? (yes/no): ");
        
        if (again.equalsIgnoreCase("no")) {
            isRunning = false;
        } else {
            String newOperator = Console.getStringInput("Enter an operator (+, -, *, /, sqrt, sqr, inv, neg, log, exp, sin, cos, tan, mr, cv, mc): ");

            if (newOperator.equals("mr")) {
                result = memory;
                Console.println("Memory Recall: %f", result);
            } else if (newOperator.equals("cv")) {
                Console.println("Current Value: %f", result);
            } else if (newOperator.equals("mc")) {
                memory = 0.0;
                Console.println("Memory cleared.");
            } else if (newOperator.equals("redo")) {
                Double editNum = Console.getDoubleInput("Enter a new number: ");
                memory = result;
                result = calculate(prevA, editNum, prevOperator);
                Console.println("Result: %f", result);
            }            
            else if (newOperator.equals("sqrt") || newOperator.equals("sqr") || newOperator.equals("inv") || newOperator.equals("neg") || newOperator.equals("log") || newOperator.equals("sin") || newOperator.equals("cos") || newOperator.equals("tan")) {
                memory = result;
                prevA = result;
                prevB = 0.0;
                prevOperator = newOperator;
                result = calculate(result, 0, newOperator);
                Console.println("Result: %f", result);
            }
            else {
                Double newNum = Console.getDoubleInput("Enter a number: ");
                memory = result;
                prevA = result;
                prevB = newNum;
                prevOperator = newOperator;
                result = calculate(result, newNum, newOperator);
                Console.println("Result: %f", result);
            }
        }
        }
        Console.println("Thank you for using our calculator!");
    }
}

// Ready to Send