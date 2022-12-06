public class Factorial
{
    public static void main(String[] args)
    {
        int n = 6, f = 1, i = 1;
        do {
            f *= i;
            i++;
        }while (i <= n);

        System.out.println("Factorial of " + n + " is " + f);
    }
}
