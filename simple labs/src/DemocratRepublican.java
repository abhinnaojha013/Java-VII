public class DemocratRepublican
{
    public static void main(String[] args)
    {
        int[] republican = {152, 85, 121, 215, 13};
        int[] democrat = {126, 32, 230, 21, 200};

        int dem = 0, rep = 0;
        for (int i = 0; i < democrat.length; i++)
        {
            dem = dem + democrat[i];
            rep = rep + republican[i];
        }

        System.out.println("Democrat = " + dem);
        System.out.println("Republican = " + rep);

        if (dem < rep)
        {
            System.out.println("Republican wins with " + (rep-dem) + " votes.");
        }
        else if (rep < dem)
        {
            System.out.println("Democrat wins with " + (dem-rep) + " votes.");
        }
        else
        {
            System.out.println("It is a draw");
        }
    }
}
