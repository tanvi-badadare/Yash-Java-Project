import java.util.Scanner;

public class four
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter volume of cylinder: ");
        double volume = in.nextDouble();
        System.out.print("Enter radius of cylinder: ");
        double r = in.nextDouble();

        double height = volume / (Math.PI * Math.pow(r, 2));
        System.out.println("Height of cylinder: " + height);
    }
}
