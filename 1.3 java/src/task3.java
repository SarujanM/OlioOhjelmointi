import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        // Validate input
        if (start < 2 || end < 2 || start >= end) {
            System.out.println("Invalid input. Ensure that start and end are positive integers and start < end.");
        } else {
            System.out.println("Prime numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
