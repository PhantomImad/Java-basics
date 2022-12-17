package Arrays.Programs;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 names.");
        String[] name = new String[10];
        for (int i = 0; i < 10; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("Enter a name to be searched.");
        String n = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (name[i].equalsIgnoreCase(n)) {
                System.out.println("Name found!");
                System.exit(0);
            }
        }
        System.out.println("Name not found");
    }
}
