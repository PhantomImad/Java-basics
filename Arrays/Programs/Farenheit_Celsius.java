package Arrays.Programs;

import java.util.Scanner;

public class Farenheit_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int[] f = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) {
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            c[i] = ((5 * (f[i] - 32)) / 9);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
    }
}
