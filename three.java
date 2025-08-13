import java.util.Scanner;

class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}

