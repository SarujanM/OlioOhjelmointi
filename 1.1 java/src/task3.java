import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna eka numero: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Anna toka numero: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.print("Anna kolmas numero: ");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;
        double average = sum / 3.0;

        System.out.printf("Sum of three numbers is " + sum); // numeroiden summa
        System.out.printf("Product of the numbers is " + product); // tuotteiden määrä
        System.out.printf("Average of the numbers is " + average); //

        scanner.close();


    }
}
