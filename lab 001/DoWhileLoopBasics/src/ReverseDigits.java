public class ReverseDigits
{
    public static void main(String[] args)
    {
        int n = 1317, rev = 0, i = n;
        do
        {
            int x = i % 10;
            rev = rev * 10 + x;
            i /= 10;
        }while (i != 0);
        System.out.println("The reverse of digits of " + n + " is " + rev);
    }
}
