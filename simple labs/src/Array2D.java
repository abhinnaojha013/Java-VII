public class Array2D
{
    public static void main(String[] args)
    {
        int[][] a = {
                        {4, 5},
                        {6, 7}
                    };

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
