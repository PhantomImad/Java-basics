package Tests;

import java.util.Scanner;

public class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 10 names and their corresponding heights");
        String[] names = new String[10];
        int[] heights = new int[10];
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
            heights[i] = sc1.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    String tempname = names[j];
                    int temp = heights[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempname;
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + heights[i]);
        }
    }
}
