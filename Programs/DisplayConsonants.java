package Programs;

import java.util.Scanner;

public class DisplayConsonants {
    void display(String str) {
        int a = str.length();
        for (int i = 0; i < a; i++) {
            char ch = str.charAt(i);
            if (ch != 'A' &&
                    ch != 'E' &&
                    ch != 'I' &&
                    ch != 'O' &&
                    ch != 'U' &&
                    ch != 'a' &&
                    ch != 'e' &&
                    ch != 'i' &&
                    ch != 'o' &&
                    ch != 'u')
                System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something.");
        String str = sc.nextLine();
        DisplayConsonants obj = new DisplayConsonants();
        obj.display(str);
    }
}
