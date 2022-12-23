public class InterfaceImplementation implements InterfaceInheritance
{
    @Override
    public double area(double a1, double a2, double a3)
    {
        return a1 + a2 + a3;
    }

    @Override
    public double area(double l, double b)
    {
        return l * b;
    }

    @Override
    public double area(double r)
    {
        return r * r;
    }
}
