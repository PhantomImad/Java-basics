package Tests;

import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Number to be searched");
        int n = sc.nextInt();
        int lb = 0, ub = 9, mid = 0;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (n == num[mid]) {
                System.out.println("Number found.");
                System.out.println("Position - " + mid);
                System.exit(0);
            } else if (n < num[mid])
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        System.out.println("Element not found");
    }
}
