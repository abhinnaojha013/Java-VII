import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Employee q1 = new Employee();
        System.out.println("");

        q1.display(q1.id, q1.name, q1.salary);
    }
}

class Employee
{
    int[] id = new int[5];
    String[] name = new String[5];
    double[] salary = new double[5];

    //    constructor to get input from the user
    Employee()
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
//            nextLine() for String and nextInt() for Integer
            System.out.print("\nEnter employee id: ");
            id[i] = scanner.nextInt();

//            using a dummy nextLine() as nextLine() takes previous line as input after nextInt()
            name[i] = scanner.nextLine();

            System.out.print("Enter employee name: ");
            name[i] = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            salary[i] = scanner.nextDouble();
        }
    }

    public void display(int[] id, String[] name, double[] salary)
    {
        System.out.println("ID\t\tName\t\t\tSalary");
        for (int i = 0; i < 5; i++)
        {
//            using if to adhere to the 3 digit format of id
            if (id[i] < 10)
            {
                System.out.print("00");
            }
            else if (id[i] < 100)
            {
                System.out.print("0");
            }
            System.out.println(id[i] + "\t\t" + name[i] + "\t\t\t" + salary[i] );
        }
    }


}
