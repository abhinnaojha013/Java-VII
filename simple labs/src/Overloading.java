public class Overloading
{
    public static void main(String[] args)
    {
        int i = 23;
        double d = 23.4;

        System.out.println("int: " + square(i));
        System.out.println("double: " + square(d));
    }

    public static int square(int x) { return x * x; }
    public static double square(double x)
    {
        return x * x;
    }
}
