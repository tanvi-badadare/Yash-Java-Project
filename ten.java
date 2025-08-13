import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 22.0 / 7.0;

        System.out.println("Choose shape to find volume:");
        System.out.println("1. Cuboid");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double volumeCuboid = length * breadth * height;
                System.out.println("Volume of Cuboid: " + volumeCuboid);
                break;

            case 2:
                System.out.print("Enter radius: ");
                double radiusCyl = sc.nextDouble();
                System.out.print("Enter height: ");
                double heightCyl = sc.nextDouble();
                double volumeCylinder = PI * radiusCyl * radiusCyl * heightCyl;
                System.out.println("Volume of Cylinder: " + volumeCylinder);
                break;

            case 3:
                System.out.print("Enter radius: ");
                double radiusCone = sc.nextDouble();
                System.out.print("Enter height: ");
                double heightCone = sc.nextDouble();
                double volumeCone = (1.0 / 3.0) * PI * radiusCone * radiusCone * heightCone;
                System.out.println("Volume of Cone: " + volumeCone);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
