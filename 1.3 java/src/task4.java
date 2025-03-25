import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                int num1 = random.nextInt(10) + 1;
                int num2 = random.nextInt(10) + 1;
                int correctAnswer = num1 * num2;

                System.out.print("What is " + num1 + " x " + num2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            }

            System.out.println("You scored " + score + "/10.");

            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables!");
                break;
            } else {
                System.out.println("Let's try again!");
            }
        }

        scanner.close();
    }
}
