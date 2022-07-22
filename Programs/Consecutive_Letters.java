package Programs;

import java.util.Scanner;

public class Consecutive_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();
        Consecutive_Letters obj = new Consecutive_Letters();
        obj.frequency(str);
    }

    void frequency(String str) //Checks the number of consecutive letters in the given word
    {
        int len = str.length();
        char chr, ch;
        int count = 0;
        for (int i = 1; i < len; i++) {
            chr = str.charAt(i);
            ch = str.charAt(i - 1);
            if (chr - ch == 1)
                count++;
        }
        System.out.println("The number of consecutive letters present in the word are " + count);
    }
}
