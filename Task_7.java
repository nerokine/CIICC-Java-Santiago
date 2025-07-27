import java.util.*;

public class Task_7 {
    public static int sum (int a, int b) {
        return a + b;
    }

    public static int diff (int a, int b) {
        return a - b;
    }

    public static int product (int a, int b) {
        return a * b;
    }

    public static int qoutient (int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numA = scanner.nextInt();

        System.out.print("Enter second number: ");
        int numB = scanner.nextInt();

        System.out.println("\nRESULTS:");

        System.out.println("Sum:" + sum(numA, numB));
        System.out.println("Difference: " + diff(numA, numB));
        System.out.println("Product: " + product(numA, numB));
        System.out.println("Qoutient: " + qoutient(numA, numB));
    }
}