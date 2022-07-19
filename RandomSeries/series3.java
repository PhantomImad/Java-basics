package RandomSeries;
import java.util.Scanner;
public class series3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        double s=0.0;
        for(int i =1; i<=n;i++)
        {
            if(i%2==0)
                s=s-(double)i/(i+1);
            else
                s=s+(double)i/(i+1);
        }
        System.out.println(s);
    }
}
