package Patterns.Patterns;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toUpperCase();

        System.out.println("Enter 'F' to display first character and enter 'L' to display last character");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case 'F':
                str = ' ' + str;
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == ' ')
                        System.out.println(str.charAt(i + 1));
                }
                break;
            case 'L':
                str = str + ' ';
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == ' ')
                        System.out.println(str.charAt(i - 1));
                }
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
