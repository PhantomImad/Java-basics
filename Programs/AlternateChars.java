package Programs;

import java.util.Scanner;

public class AlternateChars {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char ch = 'A'; ch <= 'Z'; ch += 2) {
            System.out.println(ch);
        }
    }
}

