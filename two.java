import java.util.Scanner;

public class two
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (n >= 0 && n <= 9 || n <= -1 && n >= -9)
            System.out.println("Single digit");
        else if ((n >= 10 && n <= 99) || (n <= -10 && n >= -99))
            System.out.println("Double digit");
        else if ((n >= 100 && n <= 999) || (n <= -100 && n >= -999))
            System.out.println("Triple digit");
        else
            System.out.println("More than three digits");
    }
}