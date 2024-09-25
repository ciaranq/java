import java.util.Scanner;

public class FindMin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find minimum using if statements
        int minimum;
        if (num1 <= num2 && num1 <= num3) {
            minimum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            minimum = num2;
        } else {
            minimum = num3;
        }

        System.out.println("The minimum is: " + minimum);

        // Call min method and display result
        System.out.println("Using min method: " + min(num1, num2, num3));

        // Test cases
        System.out.println("Test case: " + min(num1, num2, num3));

        scanner.close();
    }

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}