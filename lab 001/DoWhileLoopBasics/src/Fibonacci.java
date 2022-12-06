public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0, b = 1, c, i = 0;
        do
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }while (i < 10);
    }
}
