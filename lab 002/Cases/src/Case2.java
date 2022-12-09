/*
 *  Title:
 *      Case study 2
 *
 *  Description:
 *      Consider a class named phone which have functionalities like make a call, receive a
 *      call and messaging.
 *      Based on this scenario John wants to develop an application which will have class
 *      named Mobile and methods like dial, receive and message which will
 *      demonstrate the functioning of these methods.
 *
 *      Use a reference object to call these methods(dial, receive and message and display).
 *
 *  Date modified; Author(s); Modification details
 *      2022-12-06; abhinna; Created the program
 *      2022-12-08; abhinna; Added body for message and display and implemented them
 * */

public class Case2
{
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("Ram", "9811111111");
        Mobile m2 = new Mobile("Shyam", "9822222222");

        m1.dial(m2);
        m2.message(m1, "I am busy, please call later.");
    }
}

class Mobile
{
    String name;
    String number;

//    constructor to define number and name
    Mobile(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

//    dialing another person
    public void dial(Mobile mobile)
    {
        System.out.println("Dialing " + mobile.number + " " + name);
        mobile.receive(mobile);
    }

//    recieving call from someone
    public void receive(Mobile mobile)
    {
        System.out.println(mobile.number + " is calling you " + name);
    }

//    send message to someone
    public void message(Mobile mobile, String msg)
    {
        System.out.println("\nYou have sent the message " + msg + " to " + mobile.name + ", " + mobile.number);
    }

//    displaying name and number of self
    public void display()
    {
        System.out.println("\nName: " + name + ", Number: " + number);
    }
}
