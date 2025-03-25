import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a binary number");
        String binary = scanner.nextLine();

        try {

            int decimalValue = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }

        scanner.close();
    }
}
