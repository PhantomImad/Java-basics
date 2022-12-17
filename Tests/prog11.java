package Tests;

import java.util.Scanner;

public class prog11 {
    public static void main(String[] args) {
        int notes[] = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 9234087, n;
        for (int i = 0; i < 10; i++) {
            n = amount / notes[i];
            System.out.println("The number of notes of " + notes[i] + " - " + n);
            amount %= notes[i];
        }
    }
}
