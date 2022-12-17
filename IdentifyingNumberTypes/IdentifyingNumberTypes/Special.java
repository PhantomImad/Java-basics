package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Special {
    public static void println(String s) {
        System.out.println(s);
    }

    static void checkSpecial(int n) {
        int d = 0, s = 0, m = n;
        while (n > 0) {
            d = n % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            s = s + f;
            n /= 10;
        }
        if (s == m)
            println("It is a special number");
        else
            println("Not a special number");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkSpecial(n);
    }
}
