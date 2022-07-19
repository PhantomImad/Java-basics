package Programs;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d,a=0;
        do {
            d=n%10;
            a=a+d;
            n=n/10;
        }
        while(n!=0);
        System.out.println(a);
    }

}
