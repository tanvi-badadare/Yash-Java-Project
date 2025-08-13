import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int tens = num / 10;
        int ones = num % 10;

        int sum = tens + ones;
        int product = tens * ones;

        if (sum + product == num) {
            System.out.println("Special 2-digit number");
        } else {
            System.out.println("Not a special two-digit number");
        }
    }
}
