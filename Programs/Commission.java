package Programs;

import java.util.Scanner;

public class Commission {

    static void commission(double sale) {
        double com=0.0;
        if (sale <= 1000)
            com = 5.0 / 100.0 * sale;
        else if (sale >= 1001 && sale <= 2000)
            com = 10.0 / 100.0 * sale;
        else if (sale >= 2001)
            com = 15.0 / 100.0 * sale;
        System.out.println("Sales value - "+sale);
        System.out.println("Commission - "+com);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sale amount");
        double sale = sc.nextDouble();
        commission(sale);
    }
}
