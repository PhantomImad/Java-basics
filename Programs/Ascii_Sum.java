package Programs;

import java.util.Scanner;

public class Ascii_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a character");
            char ch = sc.next().charAt(0);
            sum = sum + (int) (ch);
        }
        System.out.println("Sum of ascii values of the characters - " + sum);
    }
}
