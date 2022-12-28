package com.Lab004.ArithmeticOperations;

public class ArithmeticOperations {
//     all methods are made static so that they can be used without instantiation
//     subtract operation
    public static double subtract(double a, double b) {
        return (a - b);
    } // public double subtract(double a, double b)

//     multiply operation
    public static double multiply(double a, double b) {
        return (a * b);
    } // public double multiply(double a, double b)

//     divide operation
    public static double divide(double a, double b) {
        return (a / b);
    } // public double divide(double a, double b)

//     factorial of a number
    public static double factorial(int a) {
        double fact = 1;
        if (a != 0 && a != 1) {
            for (int i = 1; i <= a; i++) {
                fact *= i;
            } // for (int i = 0; i <= a; i++)
        } // if (a == 0 || a == 1)

        return fact;
    } // public double factorial(int a)

//     reverse digits of number
    public static int reverse(int a) {
        int rev = 0, x = a;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        } // while (a != 0)

        return  rev;
    } // public int reverse(int i)
} // public class ArithmeticOperations
