package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if ((n % 10 == 7) || n % 7 == 0)
            System.out.println("It is a buzz number");
        else
            System.out.println("Not a buzz number");
    }
}
