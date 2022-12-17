package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Dudeney {
    static void checkDudeney(int n) {
        int copy = n;
        int d = 0, s = 0;
        while (n > 0) {
            d = n % 10;
            s = s + d;
            n /= 10;
        }
        if ((s * s * s) == copy)
            System.out.println("It is a dudeney number");
        else
            System.out.print("Not a dudeney number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkDudeney(n);
    }
}
