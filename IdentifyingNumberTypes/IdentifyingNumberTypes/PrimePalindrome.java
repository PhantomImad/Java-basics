package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class PrimePalindrome {
    static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    static boolean checkPalindrome(int n) {
        int rev = 0;
        int d = 0, s = 0, num = n;
        while (n != 0) {
            d = n % 10;
            s = (s * 10) + d;
            n = n / 10;
        }
        if (s == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (checkPrime(n) && checkPalindrome(n))
            System.out.println("It is a prime palindrome number");
        else
            System.out.println("Not a prime palindrome number");
    }
}
