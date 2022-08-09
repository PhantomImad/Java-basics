package Programs;

import java.util.Scanner;

public class AlternateChars {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 26; i += 2) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println((char) (ch + i));
            }
        }
    }
}

