package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.*;

public class Niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d, a = 0;
        while (n > 0) {
            d = n % 10;
            a = a + d;
            n = n / 10;
        }
        if (n % a == 0)
            System.out.println("It is a niven number");
        else
            System.out.println("No");
    }

}

