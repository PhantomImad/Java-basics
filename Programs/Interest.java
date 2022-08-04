package Programs;

import java.util.Scanner;

public class Interest {
    int p, t;
    double r, interest, amt;

    public static void main(String[] args) {
        Interest obj = new Interest();
        obj.input();
        obj.cal();
        obj.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal and time. Note that the time should be entered in years only.");
        p = sc.nextInt();
        t = sc.nextInt();
    }

    void cal() {
        if (t == 1) {
            r = 6.5;
            interest = (double) (p * r * t) / 100;
        } else if (t == 2) {
            r = 7.5;
            interest = (double) (p * r * t) / 100;
        } else if (t == 3) {
            r = 8.5;
            interest = (double) (p * r * t) / 100;
        } else if (t >= 4) {
            r = 9.5;
            interest = (p * r * t) / 100.0;
        }
        amt = p + interest;
    }

    void display() {
        System.out.println("Interest - " + interest);
        System.out.println("Amount - " + amt);
    }
}
