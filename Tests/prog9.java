package Tests;

import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter book code, book name, author, price and number of days the book is rented for");
        long code = sc.nextLong();
        String book_name = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        int days = sc.nextInt();
        int excessDays = days - 7;
        double fine = 0.0;
        if (days <= 7)
            fine = 0.0;
        else if (fine > 7 && fine <= 12)
            fine = 2.0 * excessDays;
        else if (fine > 12 && fine <= 17)
            fine = 4.0 * excessDays;
        else
            fine = 8.0 * excessDays;
        System.out.println("Fine = " + fine);
    }
}
