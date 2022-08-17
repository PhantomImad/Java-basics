package Programs;

import java.util.Scanner;

public class Capitalize_First_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();
        String st = "";
        char ch, chr;
        str = ' ' + str;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                chr = str.charAt(i + 1);
                st = st + ' ' + Character.toUpperCase(chr);
                i = i + 1;
            } else st = st + ch;
        }
        System.out.println(st);
    }
}
