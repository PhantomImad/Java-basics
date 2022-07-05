package Programs;
import java.util.Scanner;
public class IncomeTax {
    double tax;
    public void tax(String name, int income)
    {
        if(income<=250000)
            tax = 0;
        else if(income>250000 && income<=500000)
            tax = (double)(10/100)*income;
        else if(income>500000 && income<=1000000)
            tax = (double)(20/100)*income+35000;
        else if(income>1000000)
            tax = (double)(30/100)*income+50000;
        System.out.println("Name\t\tAnnual income\t\tTax");
        System.out.println(name+"\t\t"+income+"\t\t"+tax);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and your annual income");
        String name = sc.nextLine();
        int income = sc.nextInt();
        IncomeTax obj = new IncomeTax();
        obj.tax(name, income);
    }
}
