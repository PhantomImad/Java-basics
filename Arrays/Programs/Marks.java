package Arrays.Programs;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter names of students and their corresponding marks");
        String names[] = new String[10];
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
            marks[i] = sc1.nextInt();
        }
        System.out.println("Enter name to be searched");
        String name = sc.nextLine();
        int lb = 0, ub = 9, mid = 0;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (names[mid].equalsIgnoreCase(name)) {
                System.out.println("Name found!");
                System.out.println("Marks scored by " + name + " - " + marks[mid]);
                System.exit(0);
            } else if (name.compareToIgnoreCase(names[mid]) < 0)
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        System.out.println("Name not found");
    }
}

