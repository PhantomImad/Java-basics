package IdentifyingNumberTypes.IdentifyingNumberTypes;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count=0;
        int m = n,p=n;
        while (p != 0) {
            count = 0;
            int d = p % 10;
            while (m != 0) {
                int d1 = m%10;
                if(d==d1)
                    count++;
                m=m/10;
            }
            p = p / 10;
        }
        if(count==1)
            System.out.println("It as an unique number");
        else
            System.out.println("Not an unique number");
    }
}
