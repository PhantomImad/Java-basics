package Programs;

import java.util.Scanner;

public class Loan {
    int time;
    double principal, rate, interest, amt;

    public static void main(String[] args) {
        Loan obj = new Loan();
        obj.getdata();
        obj.calculate();
        obj.display();
    }

    void getdata() {
        System.out.println("Enter the principal and time");
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
        principal = sc.nextDouble();
    }

    void calculate() {
        if (time <= 5)
            interest = (principal * time * 15) / 100;
        else if (time > 5 && time <= 10)
            interest = (principal * time * 12) / 100;
        else if (time > 10)
            interest = (principal * time * 10) / 100;
        amt = principal + interest;
    }

    void display() {
        System.out.println("Interest = " + interest);
        System.out.println("Amount = " + amt);
    }

}
