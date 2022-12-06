class Inheritance1
{
    int x = 13;

    Inheritance1()
    {
        System.out.println("i1 x = " + x);
    }
}
public class Inheritance2 extends Inheritance1
{
    int x = 17;
    Inheritance2()
    {
        System.out.println("i2 x = " + x);
    }

    public void display()
    {
        System.out.println("display");
    }


    public static void main(String[] args)
    {
        Inheritance2 i2 = new Inheritance2();
        i2.display();
    }
}
