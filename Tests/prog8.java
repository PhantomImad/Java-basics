package Tests;
import java.util.Scanner;
public class prog8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings.");
        String st = sc.nextLine();
        String str = sc.nextLine();
        int lst = st.length();
        int lstr = str.length();
        if(lst>80)
            System.out.println("Enter a string with less than 80 characters");
        if(lstr>80)
            System.out.println("Enter a string with less than 80 characters");
        int length = 0;
        if(lst>lstr)
            length=lst;
        else
            length=lstr;
        for(int i=1;i<=length;i++)
        {
            char ch = st.charAt(i);
            char chr = str.charAt(i);
            if(chr==ch)
                break;
        }
    }
}
