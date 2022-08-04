package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum=0;
        int m = n;
        while (n != 0) {
            int d = n % 10;
            sum=sum+d;
            n=n/10;
        }
        if(m%sum == 0)
            System.out.print("It is a Niven number");
        else
            System.out.print("Not a Niven number");
    }
}