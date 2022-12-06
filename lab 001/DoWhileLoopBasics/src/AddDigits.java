public class AddDigits
{
    public static void main(String[] args)
    {
        int n = 666, sum = 0, i = n;
        do
        {
            int x = i % 10;
            sum += x;
            i /= 10;
        }while (i != 0);
        System.out.println("The sum of digits of " + n + " is " + sum);
    }
}
