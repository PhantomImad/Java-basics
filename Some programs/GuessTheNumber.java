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
            System.out.println("Enter a number");
            n = sc.nextInt();
            if(n==a)
            {
                System.out.println("You guessed the number correct!");
                System.exit(42);
            } else {
                System.out.println("Sadly you didn't guess it correct. You have "+c+" more tries left!");
            }
        }
        if(n!=a)
        System.out.println("The correct number was "+a);
    }
}
