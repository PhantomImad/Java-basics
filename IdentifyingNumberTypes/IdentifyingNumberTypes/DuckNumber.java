package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == 0)
                count++;
            n = n / 10;
        }
        if (count > 0)
            System.out.print("It is a duck number");
        else
            System.out.print("Not a duck number");
    }
}
