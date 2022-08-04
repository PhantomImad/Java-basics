package Programs;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.next();
        str = str.toUpperCase();
        String st, s;
        char ch;
        int i;
        ch = 0;
        int l = str.length();
        for (i = 0; i < l; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                break;
        }
        st = str.substring(i, l);
        s = str.substring(0, i);
        System.out.println(st + s + "AY");

    }
}