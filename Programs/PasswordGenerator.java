package Programs;
import java.util.Locale;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something.");
        String str = sc.next();
        int len = str.length();
        int b = (int)(Math.random() * 100);
        if(len<10)
        {
            System.out.println("Enter something that has over 10 characters");
            System.exit(42);
        }
        else {
            System.out.println(""+str.charAt(2)+str.charAt(5)+"@"+b+str.toUpperCase().substring(3, 7)+str.toLowerCase().substring(5,9));
        }
    }
}
