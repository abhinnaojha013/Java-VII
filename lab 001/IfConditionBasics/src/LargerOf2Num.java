public class LargerOf2Num
{
    public static void main(String[] args)
    {
        int a = 13, b = 17;

        if(a < b)
        {
            System.out.println("b = " + b + " is larger than a =" + a);
        }
        else if(a > b)
        {
            System.out.println("a = " + a + " is larger than b =" + b);
        }
        else
        {
            System.out.println("a = b = " + a);
        }
    }
}
