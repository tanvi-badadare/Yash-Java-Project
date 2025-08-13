import java.util.Scanner;

public class StreamSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double phy = sc.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chem = sc.nextDouble();

        System.out.print("Enter marks in Biology: ");
        double bio = sc.nextDouble();

        double avg = (phy + chem + bio) / 3;

        if (avg >= 80) {
            System.out.println("Stream: Computer Science");
        } else if (avg >= 60) {
            System.out.println("Stream: Bio-Science");
        } else if (avg >= 40) {
            System.out.println("Stream: Commerce");
        } else {
            System.out.println("No stream allocated (average below 40%)");
        }
    }
}
