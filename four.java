import java.util.Scanner;

public class CylinderHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter volume of cylinder: ");
        double volume = sc.nextDouble();
        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();

        double height = volume / ((22.0 / 7) * r * r);
        System.out.println("Height of cylinder: " + height);
    }
}
