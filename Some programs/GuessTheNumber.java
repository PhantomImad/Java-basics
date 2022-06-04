package My_own_stuff;
import java.util.*;
public class Guess_the_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,n=0;
        b = 100;
        a =(int) (Math.random()*b)+1;
        for(int i=0,c=5;i<=5;i++,c--)
        {
            String str="";
            System.out.println("Enter a number");
            n = sc.nextInt();
            if(c>1)
            {
                str="more tries left.";
            }
            if(c==1)
            {
                str="more try left.";
            }
            if(c==0)
            {
                str="tries left!";
            }
            if(n<0 || n>100)
            {
                System.out.println("Incorrect input! Input a number that is greater or equal to 0 and lesser or equal to 100!");
                System.exit(42);
            }
            if(n==a)
            {
                System.out.println("You guessed the number correct!");
                System.exit(42);
            } else {
                System.out.println("The number you guessed was incorrect. You have " +c+" "+str);
            }
        }
        if(n!=a)
        System.out.println("The correct number was "+a);
    }
}
