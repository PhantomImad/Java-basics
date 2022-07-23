package Programs;

import java.util.Scanner;

public class ElectricityBill {
    String n;
    int units;
    double bill;

    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and number of units consumed");
        n = sc.nextLine();
        units = sc.nextInt();
    }

    void calculate() {
        if (units <= 100)
            bill = units * 2.0;
        else if (units > 100 && units <= 300)
            bill = (100 * 2.0) + (units - 100) * 3.0;
        else if (units > 300) {
            bill = ((100 * 2.0) + (200 * 3.0) + (units - 300) * 5.0);
            bill = bill + (2.5 / 100.0) * bill;
        }
    }

    void print() {
        System.out.println("Name of the customer -\t\t\t" + n);
        System.out.println("Number of units consumed -\t\t\t" + units);
        System.out.println("Bill amount -\t\t\t" + bill);
    }
}
