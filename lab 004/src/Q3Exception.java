/*
    Title:
        Exception

    Description:
        Write a program to demonstrate ArrayIndexOutOfBoundsException.

    Date modified; Author(s); Modification details
        2022-12-28; abhinna; Created the program
*/

public class Q3Exception {
    public static void main(String[] args) {
//         creating an array of size 6 with values
        int[] arr = {13, 22, 34, 84, 51, 60};

//         running a loop of 10
        for (int i = 0; i < 10; i++) {
//             displaying array
//             but, there may be exception so using try-catch block too
            try {
                System.out.println(arr[i]);
            } // try
//            catching Array Index Out Of Bounds Exception
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException occurred" + arrayIndexOutOfBoundsException);
            } // catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        } // for (int i = 0; i < 10; i++)
    } // public static void main(String[] args)
} // public class Q3Exception
