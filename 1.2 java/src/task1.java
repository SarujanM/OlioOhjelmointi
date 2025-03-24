import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // käyttäjä lisää asteet Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Muutetaan fahrenheit celsius asteiksi
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Kerrotaan vastaus desimaalintarkkuudella (en tiedä toimiiko)
        System.out.printf("Temperature in Celsius: %.1f°C%n", celsius);

        // Laitetaan scanner kiinni seuraavalla komennolla
        scanner.close();
    }
}
