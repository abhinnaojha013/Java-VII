public class Operators
{
    public static void main(String[] args)
    {
        int a = 1, b = 2;

        System.out.println("Addition, a + b = " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction, a - b = " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication, a * b = " + a + " * " + b + " = " + (a * b));
        System.out.println("Division, a / b = " + a + " / " + b + " = " + (a / b));
        System.out.print("Increment, a++ = " + a + "++ => " + "a = " + a + " + 1" + " = ");
        a++;
        System.out.print(a);
        System.out.print("\nDecrement, b-- = " + b + "-- => " + "b = " + b + " - 1" + " = ");
        b--;
        System.out.print(b);
    }
}
