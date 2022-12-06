public class MethodOverride
{
    public static void main(String args[])
    {
        base b1 = new derived();
        b1.display();

        System.out.println("\n\n");

        base b2 = new base();
        b2.display();

        System.out.println("\n\n");

        derived d1 = new derived();
        d1.display();
    }
}

class base
{
    base()
    {
        System.out.println("Base class called");
    }

    public void display()
    {
        System.out.println("This is display of base class");
    }
}

class derived extends base
{
    derived()
    {
        System.out.println("derived class called");
    }

    public void display()
    {
        System.out.println("This is display of derived class");
    }
}
