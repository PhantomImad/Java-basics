package IdentifyingNumberTypes.IdentifyingNumberTypes;
import java.util.Scanner;
public class Pronic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++)
        {
            if (i * (i + 1) == n) {
                p = 1;
                break;
            }
        }
        if(p==1)
            System.out.println("It is a pronic number");
        else
            System.out.print("Nah");
    }
}
