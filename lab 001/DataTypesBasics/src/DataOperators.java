public class DataOperators
{
    public static void main(String[] args)
    {
        int i1 = 6, i2 = 12, ix = i1, iy = i2;
        float f1 = 4, f2 = 5, fx = f1, fy = f2;
        double d1 = 3.1, d2 = 1.3, dx = d1, dy = d2;
        char c1 = 'b', c2 = 'a', cx = c1, cy = c2;

        System.out.println("Addition:");
        System.out.println("int: \t\t\t " + i1 + " + " + i2 + " = " + (i1 + i2));
        System.out.println("float: \t\t\t " + f1 + " + " + f2 + " = " + (f1 + f2));
        System.out.println("double: \t\t " + d1 + " + " + f2 + " = " + (d1 + d2));
        System.out.println("char: \t\t\t " + c1 + " + " + c2 + " = " + (c1 + c2));

        System.out.println("\nSubtraction:");
        System.out.println("int: \t\t\t" + i1 + " - " + i2 + " = " + (i1 - i2));
        System.out.println("float: \t\t\t" + f1 + " - " + f2 + " = " + (f1 - f2));
        System.out.println("double: \t\t" + d1 + " - " + f2 + " = " + (d1 - d2));
        System.out.println("char: \t\t\t" + c1 + " - " + c2 + " = " + (c1 - c2));

        System.out.println("\nMultiplication:");
        System.out.println("int: \t\t\t" + i1 + " * " + i2 + " = " + (i1 * i2));
        System.out.println("float: \t\t\t" + f1 + " * " + f2 + " = " + (f1 * f2));
        System.out.println("double: \t\t" + d1 + " * " + f2 + " = " + (d1 * d2));
        System.out.println("char: \t\t\t" + c1 + " * " + c2 + " = " + (c1 * c2));

        System.out.println("\nDivision:");
        System.out.println("int: \t\t\t" + i1 + " / " + i2 + " = " + (i1 / i2));
        System.out.println("float: \t\t\t" + f1 + " / " + f2 + " = " + (f1 / f2));
        System.out.println("double: \t\t" + d1 + " / " + f2 + " = " + (d1 / d2));
        System.out.println("char: \t\t\t" + c1 + " / " + c2 + " = " + (c1 / c2));

        i1++; f1++; d1++; c1++;
        System.out.println("\nIncrement:");
        System.out.println("int: \t\t\t" + ix +   "++ = " + i1);
        System.out.println("float: \t\t\t" + fx + "++ = " + f1);
        System.out.println("double: \t\t" + dx + "++ = " + d1);
        System.out.println("char: \t\t\t" + cx + "++ = " + c1);

        i2--; f2--; d2--; c2--;
        System.out.println("\nDecrement:");
        System.out.println("int: \t\t\t" + iy + "-- = " + i2);
        System.out.println("float: \t\t\t" + fy + "-- = " + f2);
        System.out.println("double: \t\t" + dy + "-- = " + d2);
        System.out.println("char: \t\t\t" + cy + "-- = " + c2);
    }
}
