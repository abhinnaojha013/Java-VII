import java.util.Scanner;

public class Case1AmusementPark
{
    public static void main(String[] args)
    {
        int price = 400;
        int number = 15;

        int amount, discount;

        if (number > 10)
        {
            amount = price * number;
            discount = amount * 10 / 100;
            amount = amount - discount;
        }
        else
        {
            amount = price * number;
            discount = 0;
        }

        System.out.println("The total amount for " + number + " tickets at rate of Rs." +
                price + " per ticket is " + amount);
        System.out.println("You recieved Rs." + discount + " as discount");
    }
}
