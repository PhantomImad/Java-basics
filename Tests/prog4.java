package Tests;

import java.util.Scanner;

public class prog4 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n < 0 || n > 26) {
            System.out.println("Enter a number greater than 0 and lesser than 27");
            System.exit(0);
        }
        System.out.println("Letter at position " + n + " is" + (char) (n));
    }
}
