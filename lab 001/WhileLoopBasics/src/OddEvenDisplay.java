public class OddEvenDisplay
{
    public static void main(String[] args)
    {
        int i = 0, os = 0, es = 0, o = 1, e = 2;

        System.out.println("\t\tOdd\t\t\tEven");

        while (i < 10)
        {
            os = os + o;
            es = es + e;

            System.out.println((i + 1) + ".\t\t " + o + "\t\t\t " + e);

            o += 2;
            e += 2;

            i++;
        }

        System.out.println("sum:\t " + os + "\t\t " + es);
    }
}
