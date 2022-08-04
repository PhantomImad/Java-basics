package Programs;

import java.util.Scanner;

public class Cabservice {
    String name;
    long taxino;
    int d;
    Scanner sc = new Scanner(System.in);
    int bill = 0;

    Cabservice() {
        taxino = 0;
        name = "";
        d = 0;
    }

    public static void main(String[] args) {
        Cabservice obj = new Cabservice();
        obj.inpute();
        obj.calculate();
        obj.display();
    }

    void inpute() {
        System.out.println("Enter your name, taxi number and distance travelled");
        name = sc.nextLine();
        taxino = sc.nextLong();
        d = sc.nextInt();
    }

    void calculate() {

        if (d <= 1)
            bill = d * 25;
        else if (d > 1 && d <= 5)
            bill = d * 30;
        else if (d > 5 && d <= 10)
            bill = d * 35;
        else if (d > 10 && d <= 20)
            bill = d * 40;
        else if (d > 20)
            bill = d * 45;
    }

    void display() {
        System.out.println("Name\t\tTaxi No.\t\tDistance\t\tBill");
        System.out.println(name + "\t\t" + taxino + "\t\t\t\t" + d + "\t\t\t\t" + bill);
    }
}
