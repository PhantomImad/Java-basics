package Tests;

import java.util.Scanner;

public class prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        int max = n[n.length - 1];
        int min = n[0];
        for (int i = 0; i < 10; i++) {
            if (max > n[i])
                max = max;
            else if (min > n[i])
                min = n[i];
        }
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
    }
}
