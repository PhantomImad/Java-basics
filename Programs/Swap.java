package Programs;

import java.util.Scanner;

public class Swap {
    static void numSwap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    static void stringSwap(String s, String st) {
        int a = s.length();
        s = s.concat(st);
        st = s.substring(0, a);
        s = s.substring(a);
        System.out.println(s);
        System.out.println(st);
    }

    public static void main(String[] args) {
        int a, b;
        String str, st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter 2 strings");
        str = sc.next();
        st = sc.next();
        numSwap(a, b);
        stringSwap(str, st);
    }
}