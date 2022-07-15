// Changes the case of the first letter of every word in a string
package Programs;
import java.util.Scanner;

public class StringManipulation
{
    public void change(String str) {

        String t = " " + str;
        int len = t.length();

        for (int i = 0; i < len - 1; i++) {
            if (t.charAt(i) == ' ') {
                char ch = t.charAt(i+1);
                if (Character.isUpperCase(ch))
                    ch = Character.toLowerCase(ch);
                else if (Character.isLowerCase(ch))
                    ch = Character.toUpperCase(ch);
                System.out.println(ch);
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        StringManipulation obj = new StringManipulation();
        obj.change(s);
    }
}