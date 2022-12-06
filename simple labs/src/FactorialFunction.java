public class FactorialFunction
{
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("The factorial of "+ n + " is " + factorial(n));
    }

    public static int factorial(int n)
    {
        int f = 1;
        for (int i = 2; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }
}
