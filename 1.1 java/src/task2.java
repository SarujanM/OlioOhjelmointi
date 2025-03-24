public class task2 {
    public static void main(String[] args) {
        //kerrotaan rivien määrä mitä halutaan kuvion olevan
        int rivit = 4;

        for (int i = 0; i <= rivit; i++) {
            //printataan välit haluamamme koddiin
            for (int j = 0; j < rivit - i - 1; j++) {
                System.out.print(" ");
            }
            // printaamme tähdet nyt
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
