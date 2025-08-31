package com.yanodev;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] value1 = {100.0d, 10.0d, 34.0d, 45.0d, 64.0d};
        double[] value2 = {25.0d, 80.0d, 12.0d, 10.0d, 32.0d};
        char[] opCode = {'a', 's', 'm', 'd', 'r'};
        double[] result = new double[opCode.length];

        if (args.length == 0) {
            if (value1.length == value2.length && opCode.length == value1.length) {
                for (int i = 0; i < opCode.length; i++) {
                    result[i] = calculate(opCode[i], value1[i], value2[i]);
                }
                System.out.println("Result: " + Arrays.toString(result));
            } else {
                System.out.println("Length of value arrays and opcodes does not mach ");
                System.out.println("Result: " + Arrays.toString(result));
            }
        } else if (args.length == 3) {
            result[0] = processArgs(args);
            System.out.println("Result from command line: " + result[0]);
        } else{
            System.out.println("invalid parameters passed");
        }
    }

    public static double processArgs(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);

        return calculate(opCode, leftVal, rightVal);
    }

    public static double calculate(char opCode, double leftValue, double rightValue) {
        double result = 0.0d;

        switch (opCode) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 'd':
                result = rightValue != 0 ? leftValue / rightValue : 0.0d;
                break;
            case 'r':
                result = leftValue % rightValue;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        return result;
    }
}
