import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int a = 13, x = 0;
        int[] arr = {1, 2, 3, 4, 5, 6};

        try
        {
            System.out.print("Enter the divisor: ");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            try
            {
                x = Integer.parseInt(bufferedReader.readLine());
            }
            catch (IOException ioException)
            {
                System.out.println("IO exception occurred");
            }

            System.out.println("a / x = " + (a / x));

            System.out.print("Enter which element of array (1-"+ arr.length +") do you want to access: ");

            try
            {
                x = Integer.parseInt(bufferedReader.readLine());

            }
            catch (IOException ioException)
            {
                System.out.println("IO exception occurred");
            }
            System.out.println("arr[" + x + "] = " + arr[x]);
        }
        catch (ArithmeticException arithmeticException)
        {
            System.out.println("divide by 0 error");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            System.out.println("array out of bounds");
        }
        catch (Exception exception)
        {
            System.out.println("Some exception happened");
        }
        finally
        {
            System.out.println("Potential exceptions handled successfully");
        }
    }
}
