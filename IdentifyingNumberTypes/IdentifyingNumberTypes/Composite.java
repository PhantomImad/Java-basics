package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Composite {
    static void isComposite(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 1)
            System.out.println("It is a composite number");
        else
            System.out.println("Not a composite number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        isComposite(n);
    }
}
