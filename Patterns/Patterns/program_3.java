package Patterns.Patterns;

public class program_3 {
    public static void main() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.println("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
/*
 * Output -
 * * * * * * * * *
 * * * * * * *
 * * * * *
 * * *
 * 
 */
