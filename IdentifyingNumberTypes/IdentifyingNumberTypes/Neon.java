package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int m = n;
        n = n * n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        if(sum==m)
            System.out.print("It is a neon number");
        else
            System.out.print("Not a neon number");

    }
}
