package Programs;
import java.util.Scanner;
public class DisplayLetters {
    void display(String str)
    {
        for(int i=0;i<=str.length()-1;i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();
        DisplayLetters obj = new DisplayLetters();
        obj.display(str);
    }
}
