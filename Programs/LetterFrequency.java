package Programs;
import java.util.Scanner;
public class LetterFrequency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter something");
        str=str.toUpperCase();
        int count =0;
        System.out.println("Character\t\tFrequency");
        for(char ch='A';ch<='Z';ch++)
        {
            count = 0;
            for(int i=0;i<str.length();i++)
            {
                char chr=str.charAt(i);
                if(chr==ch)
                    count++;
            }
            if(count!=0)
                System.out.println(ch+"\t\t\t\t\t"+count);
        }
    }
}
