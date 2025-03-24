import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        // Kerro ensimmääisen jalan pituus
        System.out.print("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double leg2 = scanner.nextDouble();

        // Lasketaan hypotenuusa pythagoran lauseella
        double hypotenuse = Math.sqrt((leg1 * leg1) + (leg2 * leg2));

        // Vastaus
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse);

        // Laitetaan scanneri kiinni
        scanner.close();
    }
}
