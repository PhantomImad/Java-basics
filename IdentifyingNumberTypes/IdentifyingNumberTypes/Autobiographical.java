package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Autobiographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int c = 0, d = 0, s = 0;
        while (n != 0) {
            d = n % 10;
            c++;
            s = s + d;
            n /= 10;
        }
        if (s == c)
            System.out.println("Autobiographical number");
        else
            System.out.println("Not autobiographical");
    }
}
