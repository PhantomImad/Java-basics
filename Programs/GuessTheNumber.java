package Programs;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a, b, n = 0;
        b = 100;
        a = (int) (Math.random() * b) + 1;

        for (int i = 0, c = 5; i <= 5; i++, c--) {
            System.out.println("Enter a number");
            n = sc.nextInt();
            if (n > 100 || n < 0)
                System.out.println("Enter a number between 1 and 100");
            if (n == a) {
                System.out.println("You guessed the number correct!");
                System.exit(42);
            } else {
                System.out.println("That was a wrong guess. You have " + c + " more tries left!");
            }
        }
            System.out.println("The correct number was " + a);
    }
}
