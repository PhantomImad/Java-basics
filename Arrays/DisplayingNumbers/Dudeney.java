package Arrays.DisplayingNumbers;

import java.util.Scanner;

public class Dudeney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Enter 10 numbers");
    }

    static void displayDudeney(int n) {
        int copy = n;
        int d = 0, s = 0;
        while (n > 0) {
            d = n % 10;
            s = s + d;
            n /= 10;
        }
        if ((s * s * s) == copy) {
            System.out.println(copy);
        }
    }
}
