package Programs;

import java.util.Scanner;

public class DisplayAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to display upper case characters from 'Z' to 'A' and enter 2 to display lower case characters from 'a' to 'z'");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (char ch = 'Z'; ch >= 'A'; ch--) {
                    System.out.println(ch);
                }
                break;
            case 2:
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.println(ch);
                }
        }
    }
}
