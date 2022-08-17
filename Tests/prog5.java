package Tests;

import java.util.Scanner;

public class prog5 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters");
        char ch = sc.next().charAt(0);
        char chr = sc.next().charAt(0);
        int d = ch - chr;
        if (d == 0)
            System.out.println("Both the characters are same");
        if (d < 0)
            System.out.println("First character is smaller");
        if (d > 0)
            System.out.println("Second character is smaller");
    }
}
