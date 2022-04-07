/*
A number is a Spy number, if sum and product of all digits are equal. Example: Number 123 is a Spy number, sum of its digits is 6 (1+2+3 =6) and product of its digits
is 6 (1x2x3 = 6), sum and product are same, thus, 123 is a spy number.
*/

package NUMBERS;
import java.util.*;
public class spy
{
    public static void main(int n)
    {
        int s=n,i;
        int sum=0,b=1;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
            b=b*d;
            n=n/10;
        }
        if(sum == b)
            {
                System.out.print("Yes");
            }
            else
            {
                System.out.print("No");
            }
    }
}
