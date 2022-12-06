public class ReverseDigits
{
    public static void main(String[] args)
    {
        int n = 659, rev = 0;
        for (int i = n; i != 0; i /= 10)
        {
            int x = i % 10;
            rev = rev * 10 + x;
        }
        System.out.println("The reverse of digits of " + n + " is " + rev);
    }
}
