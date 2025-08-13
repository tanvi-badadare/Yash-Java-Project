import java.util.Scanner;

public class six
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        // Input details
        System.out.print("Enter customer name: ");
        String name = in.nextLine();

        System.out.print("Enter customer address: ");
        String address = in.nextLine();

        System.out.print("Enter amount of purchase: ");
        double amount = in.nextDouble();

        System.out.print("Enter type of purchase (L for Laptop / D for Desktop): ");
        char type = in.next().toUpperCase().charAt(0);

        double discountRate = 0;

        // Determine discount based on type and amount
        if (type == 'L') // Laptop
        {
            if (amount <= 25000)
                discountRate = 0.0;
            else if (amount <= 57000)
                discountRate = 5.0;
            else if (amount <= 100000)
                discountRate = 7.5;
            else
                discountRate = 10.0;
        } 
        else if (type == 'D') // Desktop
        {
            if (amount <= 25000)
                discountRate = 5.0;
            else if (amount <= 57000)
                discountRate = 7.5;
            else if (amount <= 100000)
                discountRate = 10.0;
            else
                discountRate = 15.0;
        } 
        else
        {
            System.out.println("Invalid purchase type!");
            return;
        }

        // Calculate discount and net amount
        double discountAmount = (discountRate / 100) * amount;
        double netAmount = amount - discountAmount;

        // Output results
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Purchase Amount: Rs " + amount);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: Rs " + discountAmount);
        System.out.println("Net Amount to be Paid: Rs " + netAmount);
    }
}
