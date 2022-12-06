public class EqualsEqualsIgnoreCase
{
    public static void main(String[] args)
    {
        String s1 = "String";
        String s2 = "string";
        String a = "abhinna";
        String o = " ojha";
        String spaces = "    abhinna      ";

        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
        System.out.println("concat: " + a.concat(o));
//        System.out.println("space removal: " + );
    }
}
