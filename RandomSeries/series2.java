package RandomSeries;
import java.util.Scanner;
public class series2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int s=0;
        for(int i=1; i<=n;i++)
        {
            s=s+(i*(i+1));
        }
        System.out.println(s);
    }
}
