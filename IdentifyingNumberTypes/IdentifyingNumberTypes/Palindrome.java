package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Palindrome {
    int palindrome(int a) {
        int b, c = 0;
        while (a != 0) {
            b = a % 10;
            c = (c * 10) + b;
            a = a / 10;
        }
        return (c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Palindrome obj = new Palindrome();
        int k = obj.palindrome(n);
        System.out.println("The reverse of " +n+ " is " +k);
        if (n == k)
            System.out.println("It is a palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}

