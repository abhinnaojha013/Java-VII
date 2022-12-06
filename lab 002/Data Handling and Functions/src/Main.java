/*
 *  Title:
 *  1.  Write a program to accept 5 employee IDs and the corresponding names and their salaries
 *      from the user and store them in three arrays. Pass these arrays to a function display() as
 *      arguments. This display() will display the content of the arrays in the following format.
 *
 *  2.  Write another function display() with Employee ID array and Employee name array as
 *      arguments.
 *
 *  3.  Write another function named display() which takes 4 arguments. The arguments are named
 *      as String and 3 arrays (Employee id, name and salary). Function prototype looks like:
 *      display (String name, int regno[], String Empname[], double salary[]).
 *
 *
 *
 *  Date modified; Author(s); Modification details
 *      2022-12-06; abhinna; Created the program
 * */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
//        declaring the arrays
        int[] regno = new int[5];
        String[] empName = new String[5];
        double[] salary = new double[5];

//        accepting data for arrays
        inputData(regno, empName, salary);

        System.out.println("");

//        Q1 output
        display(regno, empName, salary);
//        Q2 output
        display(regno, empName);

//        accept name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n\nEnter the name to search: ");
        String name = scanner.nextLine();

//        Q3 output
        display(name, regno, empName, salary);

    }

//    method to get input from the user
    public static void inputData(int[] regno, String[] empName, double[] salary)
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
//            nextLine() for String and nextInt() for Integer
            System.out.print("\nEnter employee id: ");
            regno[i] = scanner.nextInt();

//            using a dummy nextLine() as nextLine() takes previous line as input after nextInt()
            empName[i] = scanner.nextLine();

            System.out.print("Enter employee name: ");
            empName[i] = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            salary[i] = scanner.nextDouble();
        }
    }
    public static void display(int[] regno, String[] empName, double[] salary)
    {
        System.out.println("\n\n3 argument display");
        System.out.println("ID\t\tName\t\t\tSalary");
        for (int i = 0; i < 5; i++)
        {
//            using if to adhere to the 3 digit format of id
            if (regno[i] < 10)
            {
                System.out.print("00");
            }
            else if (regno[i] < 100)
            {
                System.out.print("0");
            }
            System.out.println(regno[i] + "\t\t" + empName[i] + "\t\t\t" + salary[i] );
        }
    }

//    overloading display(int[], String[], double[])
    public static void display(int[] regno, String[] empName)
    {
        System.out.println("\n\n2 argument display");
        System.out.println("ID\t\tName");
        for (int i = 0; i < 5; i++)
        {
//            using if to adhere to the 3 digit format of id
            if (regno[i] < 10)
            {
                System.out.print("00");
            }
            else if (regno[i] < 100)
            {
                System.out.print("0");
            }
            System.out.println(regno[i] + "\t\t" + empName[i]);
        }
    }

//    overloading display() to search and display
    public static void display (String name, int[] regno, String[] empName, double[] salary)
    {
        System.out.println("\n\n4 argument display");
        System.out.println("ID\t\tName\t\t\tSalary");
        for (int i = 0; i < 5; i++)
        {
            if (name.equalsIgnoreCase(empName[i]))
            {
                if (regno[i] < 10)
                {
                    System.out.print("00");
                }
                else if (regno[i] < 100)
                {
                    System.out.print("0");
                }
                System.out.println(regno[i] + "\t\t" + empName[i] + "\t\t\t" + salary[i] );
            }
        }
    }
}
