// IF THE WORDS START AND END WITH THE SAME LETTER
package Programs;
import java.util.Scanner;
public class SpecialWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.next();
        str=str.toUpperCase();
            System.out.println(str.charAt(0) == str.charAt(str.length()-1) ? "Special word": "Not a special word");

    }
}
