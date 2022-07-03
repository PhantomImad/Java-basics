package Methods;

import java.util.*;

public class functions {
    public void name(String str) {
        if (str.equalsIgnoreCase("whoop"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String str1 = sc.next();
        functions obj = new functions();
        obj.name(str1);
        sc.close();
    }
}
