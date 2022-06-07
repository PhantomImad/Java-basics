package String_Handling;

import java.util.*;

public class Prg_1 {
    public static void main(String args[]) {
        String a, b, c, d, e;
        a = "Hello. ";
        b = "Wassup! ";
        c = "String handling in java ";
        d = "is very easy ";
        e = "eazy";
        System.out.println("Character at 3rd place in 'Hello': " + a.charAt(3)); // Index number starts with 0
        System.out.println("Replacing 'z' with 's' in 'eazy': " + e.replace('z', 's'));
        System.out.println("Number of characters in 'String handling in java': " + c.length());
        System.out.println(a + "" + b + "" + c + "" + d);
    }
}
