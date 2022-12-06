/*
 *  Title:
 *      Case study 1
 *
 *  Description:
 *      Alex wants an application for his restaurant in which he needs to display the drinks
 *      available in his restaurant to the customers along with their prizes.
 *      Create an application which will display the menu items along with the prizes and
 *      once the order is done, it will calculate the total amount of the order and display it to
 *      the customers.
 *
 *  Date modified; Author(s); Modification details
 *      2022-12-06; abhinna; Created the program
 * */

import java.util.Scanner;

public class Case1
{
    public static void main(String[] args)
    {
//    taking scanner for input
        Scanner scanner = new Scanner(System.in);

//        for infinite loop until exit
        boolean loopMenu = true;

//        list of menu data
        String[] menuNames = {"Coffee", "Tea", "Pepsi", "Coca Cola"};
        int[] menuPrices = {50, 25, 50, 55};
        int[] quantity = new int[menuNames.length];

        DrinksMenu[] drinksMenus = new DrinksMenu[menuNames.length];

        for (int i = 0; i < menuNames.length; i++)
        {
            drinksMenus[i] = new DrinksMenu(menuNames[i], menuPrices[i]);
            quantity[i] = 0;
        }

//        infinite loop for menu
        while (loopMenu)
        {
//            displaying menu items and price
            System.out.println("Choose from menu or hit 0 to finalise orders");
            System.out.println("SN" + "\t\t\t" + "Item" + "\t\t\t" + "Price");
            for (int i = 0; i < menuNames.length; i++)
            {
                drinksMenus[i].displayMenu(i);
            }
//            taking order input
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            for (int i = 0; i < menuNames.length; i++)
            {
                if (choice - 1 == i)
                {
                    System.out.println("Enter how much of " + drinksMenus[i].name + " do you wish to purchase: ");
                    quantity[i] = quantity[i] + scanner.nextInt();
                }
                else if (choice == 0)
                {
                    loopMenu = false;
                }
            }//for
        }//while

//        calculating total
        double total = 0;
        for (int i = 0; i < menuNames.length; i++)
        {
            total = total + drinksMenus[i].price * quantity[i];
        }
//        printing the total
        System.out.println("The total is: " + total);
    }
}

class DrinksMenu
{
    String name;
    double price;

    DrinksMenu()
    {
//        default constructor required for inheritance
    }
    DrinksMenu(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayMenu(int i)
    {
        System.out.println((i + 1) + "\t\t\t" + name + "\t\t\t" + price);
    }
}
