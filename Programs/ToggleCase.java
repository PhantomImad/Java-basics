package Programs;

import java.util.Scanner;

public class ToggleCase { //To convert upper case characters to lower case and vice versa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                st = st + ch;
            } else if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                st = st + ch;
            } else
                st = st + ch;
        }
        System.out.println(st);
    }
}
