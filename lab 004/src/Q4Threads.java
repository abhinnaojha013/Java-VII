/*
    Title:
        Thread

    Description:
        Write a program to print tables of 5 by creating a new thread and display 20 even
        numbers as a task of main thread.

    Date modified; Author(s); Modification details
        2022-12-28; abhinna; Created the program
*/

public class Q4Threads {
    public static void main(String[] args) {
//         creating object of TableOf5 to pass onn thread
        TableOf5 tableOf5 = new TableOf5();
//         passing tableOf5 on Thread class to create a thread
        Thread threadTable = new Thread(tableOf5);

//         creating main thread to call the Table of 5 and display 20 even numbers
        Thread mainThread = new Thread() {
//             overriding run is must
            @Override
            public void run() {
                int i = 0, even = 0;
//                 calling child thread from main thread
                threadTable.start();

//                 printing 20 even numbers b first feeding an even number, then increasing it by 2
                while (i < 20) {
                    System.out.println(even + " is even.");
                    i++;
                    even += 2;
//                     exception handling for Thread.sleep()
                    try {
//                         using Thread.sleep(300) to display at 0.3 second intervals for better output
                        Thread.sleep(300);
                    } // try
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } // catch (InterruptedException e)
                } //  while (i < 20)
            } // public void run()
        }; // Thread mainThread = new Thread()

//         starting main thread
        mainThread.start();
    } // public static void main(String[] args)
} // public class Q4Threads


// creating a runnable thread class by implementing Runnable interface
class TableOf5 implements Runnable
{
//     overriding run method of Runnable interface
    @Override
    public void run() {
//         print table of 5 from thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
//             exception handling for Thread.sleep()
            try {
//                 using Thread.sleep(300) to display at 0.3 second intervals for better output
                Thread.sleep(300);
            } // try
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // catch (InterruptedException e)
        } // for (int i = 1; i <= 10; i++)
    } // public void run()
} // class Thread1 implements Runnable