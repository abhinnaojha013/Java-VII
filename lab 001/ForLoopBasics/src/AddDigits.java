    public class AddDigits
    {
        public static void main(String[] args)
        {
            int n = 659, sum = 0;
            for (int i = n; i != 0; i /= 10)
            {
                int x = i % 10;
                sum += x;
            }
            System.out.println("The sum of digits of " + n + " is " + sum);
        }
    }
