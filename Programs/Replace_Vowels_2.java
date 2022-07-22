package Programs;

import java.util.Scanner;

public class Replace_Vowels_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();
        str=str.toUpperCase();
        for(int i=1;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                str=str.replace(ch, ++ch);
        }
        System.out.println(str);
    }
}
