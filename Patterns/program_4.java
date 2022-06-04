package Patterns;
import java.util.*;
public class patter_4
{
    public static void main()
    {
        int n=5;
        for(int i=1,p=5;i<=n;i++,p--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

/*
Output - 
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 
*/
