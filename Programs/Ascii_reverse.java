package Programs;

import java.util.Scanner;

public class Ascii_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);
        int a = (int) (ch);
        int sum = 0;
        while (a != 0) {
            int d = a % 10;
            sum = sum + d;
            a = a / 10;
        }
        System.out.println((char) (sum));
    }
}
