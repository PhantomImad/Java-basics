package Tests;

import java.util.Scanner;

public class prog2 {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        for(int i=1; i<=5;i++)
        {
            System.out.println((char)(ch+i));
        }
    }
}
