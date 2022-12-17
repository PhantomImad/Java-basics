package Arrays.DisplayingNumbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to check for a number and enter 2 to check for a string");
        int a = sc.nextInt();
        int n = 1;
        while (n != 0) {
            switch (a) {
                case 1:
                    System.out.println("Enter 10 numbers");
                    int[] num = new int[10];
                    for (int i = 0; i < 10; i++) {
                        num[i] = sc.nextInt();
                    }
                    System.out.println("List of palindrome numbers");
                    for (int j = 0; j < 10; j++) {
                        obj.checkPalin(num[j]);
                    }
                    break;
                case 2:
                    System.out.println("Enter 10 strings.");
                    String[] str = new String[10];
                    for (int i = 0; i < 10; i++) {
                        str[i] = sc.nextLine();
                    }
                    System.out.println("List of palindrome strings");
                    for (int j = 0; j < 10; j++) {
                        String s = str[j];
                        for(int f = s.length()-1;a>=0;a--)
                        {
                            obj.checkPalin(str[j]);
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Enter 0 if you want to stop, or enter any other number to continue!");
            n = sc.nextInt();
        }
    }

    void checkPalin(int n) {
        int rev = 0;
        int copy = n;
        while (n != 0) {
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        if (copy == rev) {
            System.out.println(copy);
            System.exit(0);
        }
    }

    void checkPalin(String str) {
        String st = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            st = st + str.charAt(i);
        }
        if (str.equalsIgnoreCase(st)) {
            System.out.println(str);
            System.exit(0);
        }
    }
}
