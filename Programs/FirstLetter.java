package Programs;
import java.util.Scanner;
public class FirstLetter {
    public static void main(String[] args) {
        char ch, chr;
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.next();
        chr = str.charAt(0);
        System.out.print(chr);
        while(sc.hasNext())
        {
            chr=str.charAt(0);
            System.out.print(chr);
        }
    }
}
