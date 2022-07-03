package Programs;
import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String args[]) {
        String choice="";
        String[] options = {"rock", "scissors", "paper"};
        int random = (int) (Math.random() * 3);
        String gen = options[random];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors");
        choice = sc.next();
        choice = choice.toLowerCase();
        if(!(choice.equalsIgnoreCase("scissors") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("rock"))) {
            System.out.println("Enter a valid choice");
            System.exit(0);
        }
        if(choice.equalsIgnoreCase("paper") && random == 0)
        {
            System.out.println("Your choice - "+choice);
            System.out.println("System's choice - "+gen);
            System.out.println("You win!");
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("rock") && random == 2)
        {
            System.out.println("Your choice - "+choice);
            System.out.println("System's choice - "+gen);
            System.out.println("You lose!");
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("rock") && random == 1)
        {
            System.out.println("Your choice - "+choice);
            System.out.println("System's choice - "+gen);
            System.out.println("You win!");
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("scissors") && random == 0)
        {
            System.out.println("Your choice - "+choice);
            System.out.println("System's choice - "+gen);
            System.out.println("You lose!");
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("paper") && random == 1)
        {
            System.out.println("Your choice - "+choice);
            System.out.println("System's choice - "+gen);
            System.out.println("You lose!");
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("scissors") && random == 2) {
            System.out.println("Your choice - " + choice);
            System.out.println("System's choice - " + gen);
            System.out.println("You win!");
            System.exit(0);
        }
    }
}
