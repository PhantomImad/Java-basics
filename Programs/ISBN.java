package Programs;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        int n = sc.nextInt();
        int copy = n;
        int sum = 0, prod = 1, count = 0;
        while (copy > 0) {
            copy = copy / 10;
            count++;
        }
        if (count < 10 || count > 10) {
            System.out.println("Enter a 10 digit number");
        }
    }
}
