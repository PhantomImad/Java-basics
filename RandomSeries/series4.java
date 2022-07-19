package RandomSeries;
import java.util.Scanner;
public class series4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of 'a' and 'n'");
        int a,n;
        double s=0.0;
        a= sc.nextInt();
        n=sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            s=(double)a/(i+1);
        }
        System.out.print(s);
    }
}
