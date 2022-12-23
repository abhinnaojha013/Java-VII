import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream1
{
    public static void main(String[] args) throws IOException
    {
        String name;
        int age;
        double salary;


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter name: ");
        name = br.readLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(br.readLine());

        System.out.print("Enter salary: ");
        salary = Double.parseDouble(br.readLine());


        System.out.println("\nName: " + name + "\tAge: " + age + "\tSalary: " + salary);
    }
}
