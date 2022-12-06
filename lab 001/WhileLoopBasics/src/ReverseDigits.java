public class ReverseDigits
{
    public static void main(String[] args)
    {
        int n = 6059, rev = 0, i = n;
        while (i != 0)
        {
            int x = i % 10;
            rev = rev * 10 + x;
            i /= 10;
        }
        System.out.println("The reverse of digits of " + n + " is " + rev);
    }
}
