/*
Sample Input =>
String 1 - HISTORY
String 2 - SCIENCE
Sample Output => HEICSNTEOIRCYS
*/
package Programs;

import java.util.Scanner;

public class AlternateStringLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String st = sc.nextLine().toUpperCase();
        System.out.println("Enter second string");
        String str = sc.nextLine().toUpperCase();
        String s = "";
        int len = st.length();
        for (int i = 0; i < len; i++) {
            char c = st.charAt(i);
            char ch = str.charAt(len - i - 1);
            s = s + c;
            s = s + ch;
        }
        System.out.println(s);
    }
}
