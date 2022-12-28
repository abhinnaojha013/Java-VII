/*
    Title:
        Interfaces

    Description:
        Write a program to define a queue interface and have insert and delete methods
        in the interface. Implement these methods in a class.

    Date modified; Author(s); Modification details
        2022-12-28; abhinna; Created the program
*/

import java.util.Scanner;

// class of individual members of queue
class QueueValue {
    int value;
    QueueValue next;

    public QueueValue(int value) {
        this.value = value;
        next = null;
    } // QueueValue(int value)
} // class QueueValue


// an interface to implement insert and delete methods
interface IQueue {
    void insert(QueueValue q);
    void delete();
} // interface IQueue


// implementation of interface on class
class Queue implements IQueue {
//     front and back pointers of the queue to keep track of the front and back of queue
//     for insert and delete
    QueueValue front, back;

//     initialising queue to be empty queue at the beginning
    public Queue() {
        front = null;
        back = null;
    } // public Queue()

//     overriding interface methods
    @Override
    public void insert(QueueValue q) {
//         if front = null, it is an empty queue
//         so, front and back are the newly inserted value
        if (front == null) {
            front = q;
            back = q;
        } // if (front == null)
        else {
//         replace the null on next pointer of current back to newly inserted queue value
//         then replace the current back value with newly inserted queue value
//             back.next = q; back = q; is also viable
            back.next = q;
            back = back.next;
        } // else of if (front == null)
    } // public void insert(QueueValue q)

    @Override
    public void delete() {
//         to delete, just replace the front pointer with the next of front so front changes
//         front defines the start of queue, so the old front cannot be accessed, thus is deleted
        front = front.next;

//         if front = null then queue becomes empty so assign back as null too
        if (front == null) {
            back = null;
        } // if (front == null)
    } // public void delete()

    public void display() {
        QueueValue i = front;

//         displaying values from front
//         once the next pointer of a value is null, queue has reached its end
//         also, once i = back the queue reaches is end, so it can be implemented that way too
        while (i != null) {
            System.out.println(i.value);
            i = i.next;
        } // while (i != null)
    } // public void display()
} // class Queue implements IQueue

// main class that has the main
public class Q1Interfaces {
    public static void main(String[] args) {
//         creating array of queue values for easier manipulation
        int[] queueArray = {1, 2, 3, 4, 5};
        QueueValue[] queueValue = new QueueValue[queueArray.length];
        int x = 0;

//         creating the queue
        Queue queue = new Queue();

//         defining infinite flag for while based infinite loop
        boolean infiniteFlag = true;

//         infinite loop until exit is hit
        while (infiniteFlag) {
            System.out.println("\n1.insert");
            System.out.println("2.delete");
            System.out.println("3.display");
            System.out.println("0.exit");
            System.out.print("Make your choice: ");

            int choice;
            Scanner scanner = new Scanner(System.in);
//             scanner may have exception if user inputs character or decimals instead of integers
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 0 ->
                            infiniteFlag = false;
                    case 1 -> {
                        System.out.print("Enter integer to insert: ");
                        // try for input of value for QueueValue(value)
                        try {
                            int value = Integer.parseInt(scanner.nextLine());
                            queueValue[x] = new QueueValue(value);
                            queue.insert(queueValue[x]);
                            x++;
                        } // try of value for QueueValue(value)
                        catch (Exception exception) {
                            System.out.println("Invalid input");
                        } // catch
                    } // case 1

                    case 2 ->
                        queue.delete();
                    // case 2
                    case 3 ->
                        queue.display();
                    // case 3
                } // switch (choice)
            } // try of choice
            catch (Exception exception) {
                System.out.println("Invalid choice.");
            } // catch (Exception exception)
        } // while (infiniteFlag)
    }
}
