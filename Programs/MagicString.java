package Programs;

import java.util.Scanner;

public class MagicString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String str = sc.next();
        str=str.toUpperCase();
        int a=str.length(), c;
        for(char ch='A'; ch<='Z'; ch++)
        {
            c=0;
            for(int i=0;i<a;i++)
            {
                char chr = str.charAt(i);
                if(c==chr)
                    c++;
            }
            if(c>1)
                System.out.println("Not a unique string");
            System.exit(42);
        }
        System.out.println("It is a unique string");
    }
}