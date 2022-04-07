//Using Scanner class to input data from user
import java.util.*;
public class Prg_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in) //Decalres sc as Scanner variable.
          System.out.println("Enter a number");
      int a = sc.nextInt();
        System.out.println("Enter a sentence");
      String b = sc.nextLine();
        System.out.println("Enter a decimal");
      double d = sc.nextDouble();
        System.out.println("Enter a charactar");
      char c = sc.next();
      System.out.println("The number you entered = "+a);
        System.out.println("The sentence you entered = "+b);
        System.out.println("The decimal number you entered = "+d);
        System.out.println("The character you entered = "+c);
    }
}
