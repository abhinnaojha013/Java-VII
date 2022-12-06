public class AddDigits
{
    public static void main(String[] args)
    {
        int n = 619, sum = 0, i = n;
        while (i != 0)
        {
            int x = i % 10;
            sum += x;
            i /= 10;
        }
        System.out.println("The sum of digits of " + n + " is " + sum);
    }
}
