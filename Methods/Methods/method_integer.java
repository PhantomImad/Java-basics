package Methods;

import java.util.*;

public class method_integer {
    public int add() {
        int a = 0, b = 0, c;
        c = a + b;
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        method_integer obj = new method_integer();
        System.out.println("Enter");
        int a = sc.nextInt();
        System.out.println("Enter");
        int b = sc.nextInt();
        System.out.println(obj.add());
    }
}
