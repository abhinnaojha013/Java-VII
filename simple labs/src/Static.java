public class Static
{
    static int x = 200;

    public static void function()
    {
        System.out.println("This is static function");
    }

    static
    {
        System.out.println("This is static block");
    }

    public static void main(String args[])
    {
        System.out.println("The value is: " + Static.x);
        Static.function();
    }
}   
