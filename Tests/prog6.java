package Tests;

import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int prod = a * b;
        String c = Integer.toString(sum) + Integer.toString(prod);
        System.out.println(c);
    }
}
