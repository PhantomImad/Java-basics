package Programs;

import java.util.Scanner;

public class Quadratic_Equation {
    float a, b, c, d;
    double r1, r2;

    Quadratic_Equation(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c");
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        Quadratic_Equation obj = new Quadratic_Equation(x, y, z);
        obj.calculate();
    }

    void calculate() {
        if (d < 0) {
            System.out.println("Roots not possible");
            System.exit(42);
        }
        d = (b * b) - (4 * a * c);
        r1 = (((-b) + (Math.sqrt(d))) / 2 * a);
        r2 = (((-b) - (Math.sqrt(d))) / 2 * a);
        System.out.println("Discriminant - " + d);
        System.out.println("First root - " + r1);
        System.out.println("Second root - " + r2);
    }
}
