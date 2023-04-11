
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the chess table size: ");
        int size = scanner.nextInt();
        draw(size);

    }

    public static void draw(int size){

        for (int lineNumber = 1; lineNumber <= size; lineNumber++) {

            for (int colNumber = 1; colNumber <= size; colNumber++) {
                if ((colNumber % 2 != 0 && lineNumber % 2 != 0) || (colNumber % 2 == 0 && lineNumber % 2 == 0)) {
                    System.out.print('⬛');
                } else {
                    System.out.print('⬜');
                }
            }

            System.out.println();

        }

    }
}