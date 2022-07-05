/*
- void calculate(int m, char ch) check whether the integer passed is divisible by seven, if the char given is 's', else
it checks if the last digit of the int is 7.
- void calculate(int a, int b, char ch) - Displays the greater int if the value of char is 'g', or else it displays
the smaller argument.
*/
package Programs;
import java.util.Scanner;
public class Overloading_1 {
    public void calculate(int m, String ch)
    {
        if(ch.equalsIgnoreCase("s"))
        {
            System.out.println(m%7==0? "The number is divisible by 7": "The number is not divisible by 7");
        }
        else
        {
            for(int i=0; i<=m;i++)
            {
                System.out.println(m%10==7? "The last digit of the number is 7": "The last digit is not seven");
            }
        }
    }
    public void calculate(int a, int b, String ch)
    {
        if(ch.equalsIgnoreCase("g"))
        {
            System.out.println(Math.max(a, b));
        }
        else
            System.out.println(Math.min(a, b));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,m;
        System.out.println("Enter the value of a, b and m and ch.");
        String ch = sc.nextLine();
        a=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        Overloading_1 obj = new Overloading_1();
        obj.calculate(m, ch);
        obj.calculate(a, b, ch);
    }
}
