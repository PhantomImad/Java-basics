package Tests;

import java.util.Scanner;

public class prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6");
        int a[] = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 4");
        int b[] = new int[6];
        for (int i = 0; i < 4; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[10];
        int m = 0;
        for (int i = 0; i < 10; i++) {
            if (i < 6)
                c[i] = a[i];
            else {
                c[i] = b[m];
                m++;
            }
        }
        for (int i = 0; i < 10; i++)
            System.out.println(c[i]);
    }
}
