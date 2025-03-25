import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ensimmäinen askel
        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discrimant
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are:" + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("No real roots");
        }

        scanner.close();
    }

}
