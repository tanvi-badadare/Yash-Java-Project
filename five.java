import java.util.Scanner;

public class five
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        // Input units consumed
        System.out.print("Enter electricity units consumed: ");
        double units = in.nextDouble();

        double bill = 0;

        // Calculate bill according to slabs
        if (units <= 50)
            bill = units * 0.5;
        else if (units <= 170) // 50 + 120
            bill = (50 * 0.5) + ((units - 50) * 0.85);
        else if (units <= 300) // 50 + 120 + 130
            bill = (50 * 0.5) + (120 * 0.85) + ((units - 170) * 1.2);
        else // Above 300
            bill = (50 * 0.5) + (120 * 0.85) + (130 * 1.2) + ((units - 300) * 1.75);

        // Add surcharge (20%)
        double surcharge = bill * 0.20;

        // Add Govt. Tax (15.5%)
        double tax = bill * 0.155;

        double totalBill = bill + surcharge + tax;

        // Display the bill details
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Base Bill: Rs " + bill);
        System.out.println("Surcharge (20%): Rs " + surcharge);
        System.out.println("Govt. Tax (15.5%): Rs " + tax);
        System.out.println("Total Bill to be Paid: Rs " + totalBill);
    }
}
