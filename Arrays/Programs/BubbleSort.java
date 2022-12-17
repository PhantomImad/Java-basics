package Arrays.Programs;

import java.util.Scanner;

public class BubbleSort {
    static void sort(int[] m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                if (m[j] > m[j + 1]) {
                    int temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++)
            System.out.println(m[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sort(a);
    }
}
