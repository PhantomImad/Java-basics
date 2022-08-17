package Tests;

import java.util.Scanner;

public class prog3 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        int vw = 0, cs = 0;
        System.out.println("Enter a character");
        for (int i = 1; i <= 20; i++) {
            char ch = sc.next().charAt(0);
            ch = Character.toUpperCase(ch);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vw++;
            else
                cs++;
        }
        System.out.println("Number of consonants - " + cs);
        System.out.println("Number of vowels - " + vw);
    }
}
