package Tests;

import java.util.Scanner;

public class prog1 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println((char)(ch + 10));
    }
}
