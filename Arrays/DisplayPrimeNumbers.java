package Arrays;

import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int n[] = new int[10];
        DisplayPrimeNumbers obj = new DisplayPrimeNumbers();
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        for (int x = 0; x < 10; x++) {
            obj.checkPrime(n[x]);
        }
    }

    void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(n);
    }
}
