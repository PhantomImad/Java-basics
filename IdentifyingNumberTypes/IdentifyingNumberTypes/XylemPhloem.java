package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class XylemPhloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        char a, b;
        a = str.charAt(0);
        b = str.charAt(str.length() - 1);
        int a1 = Integer.parseInt(a + "");
        int b1 = Integer.parseInt(b + "");
        int es = a1 + b1;
        String st = str.substring(1, str.length() - 1);
        int c = Integer.parseInt(st);
        int d = 0, s = 0, copy = c;
        while (c != 0) {
            d = c % 10;
            s = s + d;
            c /= 10;
        }
        int ms = s;
        if (es == ms)
            System.out.println("It is a xylem number");
        else
            System.out.println("It is a phloem number");
    }
}
