package RandomSeries;
import java.util.Scanner;
public class series1 {
    void SumSeries(int n, double x)
    {
        double sum = 0.0;
        int i;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                sum=sum-(double)x/i;
            else
                sum=sum+(double)x/i;
        }
        System.out.println("Sum of first series = "+sum);
    }
    void SumSeries()
    {
        int sum =0,a=1;
        for(int i=1; i<=20;i++)
        {
            a=a*i;
            sum=sum+a;
        }
        System.out.println("Sum of second series = "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of 'n' and 'x'");
        int n=sc.nextInt();
        double x = sc.nextDouble();
        series1 obj = new series1();
        obj.SumSeries(n,x);
        obj.SumSeries();
    }
}
