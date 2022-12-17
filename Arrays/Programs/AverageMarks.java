package Arrays.Programs;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter names and marks of 10 students");
        String[] names = new String[10];
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
            marks[i] = sc1.nextInt();
        }
        int sum = 0, avg = 0, max = marks[0];
        for (int i = 0; i < 10; i++) {
            sum = sum + marks[i];
        }
        avg = sum / 10;
        int n = 0;
        System.out.println("Average in subject = " + avg);
        for (int i = 0; i < 10; i++) {
            if (marks[i] > max) {
                max = marks[i];
                n = i;
            }
        }
        System.out.println("Maximum marks scored = " + max);
        System.out.println("Name of student = " + names[n]);
    }
}
