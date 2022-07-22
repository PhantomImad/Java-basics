package Programs;
import java.util.Scanner;
public class AlphaOrder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String str = sc.nextLine();
        str=str.toUpperCase();

        for(char ch = 'A';ch<='Z';ch++)
        {
            for(int i=0;i<str.length();i++)
            {
                char chr=str.charAt(i);
                if(chr==ch)
                    System.out.print(chr);
            }
        }
    }
}
