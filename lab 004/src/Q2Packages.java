// importing the package to use
import com.Lab004.ArithmeticOperations.*;

import java.util.Scanner;

public class Q2Packages {
    public static void main(String[] args) {
//         flag for infinite loop
        boolean infiniteFlag = true;

        while (infiniteFlag){
            System.out.println("\n1. Subtract");
            System.out.println("2. Multiply");
            System.out.println("3. Divide");
            System.out.println("4. Factorial");
            System.out.println("5. Reverse digits");
            System.out.println("0. Exit");
            System.out.print("Make your choice: ");

            int choice;
            Scanner scanner = new Scanner(System.in);

//            scanner is for integer only
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 0 -> infiniteFlag = false;
                     // case 0

//                     Subtract 2 numbers
                    case 1 -> {
//                        scanner for double only
                        try {
                            System.out.print("\nEnter a for a - b: ");
                            double a = Double.parseDouble(scanner.nextLine());

                            System.out.print("\nEnter b for a - b: ");
                            double b = Double.parseDouble(scanner.nextLine());

                            System.out.println(a + " - " + b + " = " + ArithmeticOperations.subtract(a, b));
                        } // try
                        catch (Exception exception) {
                            System.out.println("Error in input.");
                        } // catch
                    } // case 1

//                     Multiply 2 numbers
                    case 2 -> {
//                        scanner for double only
                        try {
                            System.out.print("\nEnter a for a * b: ");
                            double a = Double.parseDouble(scanner.nextLine());

                            System.out.print("\nEnter b for a * b: ");
                            double b = Double.parseDouble(scanner.nextLine());

                            System.out.println(a + " * " + b + " = " + ArithmeticOperations.multiply(a, b));
                        } // try
                        catch (Exception exception) {
                            System.out.println("Error in input.");
                        } // catch
                    } // case 2

//                     Multiply 2 numbers
                    case 3 -> {
//                        scanner for double only
                        try {
                            System.out.print("\nEnter a for a / b: ");
                            double a = Double.parseDouble(scanner.nextLine());

                            System.out.print("\nEnter b for a / b: ");
                            double b = Double.parseDouble(scanner.nextLine());

//                             error handling for divide by 0 by not allowing the error state to reach
                            if (b == 0) {
                                System.out.println("Divide by 0 error");
                            } // if (b == 0)
                            else {
                                System.out.println(a + " / " + b + " = " + ArithmeticOperations.divide(a, b));
                            } // else of if (b == 0)
                        } // try
                        catch (Exception exception) {
                            System.out.println("Error in input.");
                        } // catch
                    } // case 3

//                     Factorial
                    case 4 -> {
//                        scanner for int only
                        try {
                            System.out.print("\nEnter a for a!: ");
                            int a = Integer.parseInt(scanner.nextLine());

//                             error handling for -ve numbers by not allowing the error state to reach
                            if (a < 0) {
                                System.out.println("Factorial is only allowed for +ve numbers");
                            } // if (a < 0)
                            else {
                                System.out.println(a + "! " + " = " + ArithmeticOperations.factorial(a));
                            } // else of if (a < 0)
                        } // try
                        catch (Exception exception) {
                            System.out.println("Error in input.");
                        } // catch
                    } // case 4

//                     Reverse
                    case 5 -> {
//                        scanner for int only
                        try {
                            System.out.print("\nEnter a for a's reverse digits: ");
                            int a = Integer.parseInt(scanner.nextLine());

//                             error handling for -ve numbers by not allowing the error state to reach
                            if (a < 0) {
                                System.out.println("Reverse is only allowed for +ve numbers");
                            } // if (a < 0)
                            else {
                                System.out.println(a + "'s reverse " + " is " + ArithmeticOperations.reverse(a));
                            } // else of if (a < 0)
                        } // try
                        catch (Exception exception) {
                            System.out.println("Error in input.");
                        } // catch
                    } // case 5

                } // switch (choice)
            } // try
            catch (Exception exception) {
                System.out.println("Error in input.");
            } // catch
        } // while (infiniteFlag)
    } // public static void main(String[] args)
} // public class Q2Packages

