package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.*;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sq = n * n;
        String str = Integer.toString(sq);
        int len = str.length();
        int half = len / 2;
        String s1 = str.substring(0, half);
        String s2 = str.substring(half);
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if (n == (a + b))
            System.out.println("It is a kaprekar number");
        else
            System.out.println("Not a kaprekar number");
    }
}
