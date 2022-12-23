public interface InterfaceInheritance extends DerivedInterface
{
    double area(double a1, double a2, double a3);
}

interface BaseInterface
{
    double area(double l, double b);
}

interface DerivedInterface extends BaseInterface
{
    double area(double r);
}