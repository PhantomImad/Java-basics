package Programs;
import java.util.Scanner;
public class CheckVowels {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();
        str=str.toUpperCase();
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                a=a+1;
        }
        System.out.println(a);
    }
}
