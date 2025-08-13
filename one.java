import java.util.Scanner;

public class one
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int empid = in.nextInt();
        in.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = in.nextLine();

        System.out.print("Enter Department: ");
        String dept = in.nextLine();

        System.out.print("Enter Salary: ");
        int salary = in.nextInt();
        
        System.out.println(empid);
        System.out.println("Mr. " + name + " of " + dept + " department earns a salary " + salary + " Rs.");
    }
}
