package Programs;

import java.util.Scanner;

public class Employee_Salary {
    String name, empno;
    int basic;
    double da, hra, pf, gs, net;

    Employee_Salary(String n, String en, int b) {
        name = n;
        empno = en;
        basic = b;
    }

    public static void main(String[] args) {
        String nm, enm;
        int bsal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, number and basic salary");
        nm = sc.nextLine();
        enm = sc.nextLine();
        bsal = sc.nextInt();
        Employee_Salary obj = new Employee_Salary(nm, enm, bsal);
        obj.calc();
        obj.display();
    }

    void calc() {
        da = basic * 30.0 / 100.0;
        hra = basic * 15.0 / 100.0;
        pf = basic * 12.0 / 100.0;
        gs = basic + da + hra;
        net = gs - pf;
    }

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Employee number - " + empno);
        System.out.println("Gross salary - Rs. " + gs);
        System.out.println("Net salary - Rs. " + net);
    }
}
