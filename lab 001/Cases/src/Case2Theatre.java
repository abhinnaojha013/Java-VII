public class Case2Theatre
{
    public static void main(String[] args)
    {
        String category = "silver";

        int price = 0;

        if(category.equals("gold"))
        {
            price = 200;
        }
        else if (category.equals("silver"))
        {
            price = 150;
        }

        System.out.println("The category chosen is " + category + " and price is Rs. " + price);
    }
}
