import java.util.Scanner;

public class seven
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double phy = in.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chem = in.nextDouble();

        System.out.print("Enter marks in Biology: ");
        double bio = in.nextDouble();

        double avg = (phy + chem + bio) / 3;

        if (avg >= 80)
            System.out.println("Stream: Computer Science");
        else if (avg >= 60)
            System.out.println("Stream: Bio-Science");
        else if (avg >= 40)
            System.out.println("Stream: Commerce");
        else
            System.out.println("No stream allocated (average below 40%)");
    }
}
