public class Factorial
{
    public static void main(String[] args)
    {
        int n = 9, f = 1, i = 1;
        while (i <= n)
        {
            f *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is " + f);
    }
}
