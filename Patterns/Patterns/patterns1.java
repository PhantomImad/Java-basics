/*
void polygon(int n, char ch) - square of side 'n' using the character stored in 'ch'.
void polygon(int x, int y) - rectangle of length 'x' and breadth 'y', using the symbol '@'
*/
package Patterns.Patterns;
import java.util.Scanner;
public class patterns1 {
    void polygon(int n, char ch)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void polygon(int x, int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    void polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int x,y,n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter the value of 'n' character 'ch'");
        n=sc.nextInt();
        ch= sc.next().charAt(0);
        patterns1 obj = new patterns1();
        obj.polygon(n, ch);
        obj.polygon(x,y);
        obj.polygon();
    }
}
