/*
* title:
*   creation of student class
* description:
*   creating a class named Student and create a constructor to assign values and methods to display them
* first created (date, author):
*   2022-12-04, abhinna
 * updates (date author):
* */


public class Student
{
    private int roll_number;
    private String name;
    private int s_class;


    //constructor to assign values
    public Student(int roll_number, String name, int s_class)
    {
        this.roll_number = roll_number;
        this.name = name;
        this.s_class = s_class;
    }

////    these methods work only when attributes are static
//    public static void displayRoll()
//    {
//        System.out.println("Roll : " + roll_number);
//    }
//    public static void displayName()
//    {
//        System.out.println("Name : " + name);
//    }
//    public static void displayClass()
//    {
//        System.out.println("Class : " + s_class);
//    }

//    displaying values
    public void display()
    {
////        these methods work on static only
//        displayRoll();
//        displayName();
//        displayClass();

        System.out.println("Roll : " + roll_number);
        System.out.println("Name : " + name);
        System.out.println("Class : " + s_class);
    }

    public static void main(String[] args)
    {
        Student s = new Student(33, "Ram", 12);
        s.display();
    }
}
