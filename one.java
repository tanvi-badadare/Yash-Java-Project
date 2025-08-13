import java.util.Scanner;

class Employee {
    int empid;
    String name;
    int salary;
    String dept;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    void displayDetails() {
        System.out.println(empid);
        System.out.println("Mr. " + name + " of " + dept + " department earns a salary " + salary + " Rs.");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.acceptDetails();
        e.displayDetails();
    }
}
