import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String com;

        Random rand = new Random();
        int randChoice = rand.nextInt(3);
        if (randChoice == 0) {
            com = "rock";
        } else if (randChoice == 1) {
            com = "paper";
        } else {
            com = "scissor";
        }
        // random section close

        // input section begin.

        Scanner sc = new Scanner(System.in);
        System.out.println("chose One (rock / paper / scissor)");
        System.out.print("Enter Your Choice : ");
        String userchoice = sc.nextLine();
        sc.close();

        // input section close.

        System.out.println("User Input : " + userchoice);
        System.out.println("Computer Choice : " + com);

        if (com.equals("rock") && userchoice.equals("rock")) {
            System.out.println("Match Draw");
        } else if (com.equals("rock") && userchoice.equals("paper")) {
            System.out.println("You have won");
        } else if (com.equals("rock") && userchoice.equals("scissor")) {
            System.out.println("Cmputer won");
        }

        else if (com.equals("paper") && userchoice.equals("rock")) {
            System.out.println("Computer won");
        } else if (com.equals("paper") && userchoice.equals("paper")) {
            System.out.println("Match Draw");
        } else if (com.equals("paper") && userchoice.equals("scissor")) {
            System.out.println("You have won");
        }

        else if (com.equals("scissor") && userchoice.equals("rock")) {
            System.out.println("You have won");
        } else if (com.equals("scissor") && userchoice.equals("paper")) {
            System.out.println("Computer won");
        } else if (com.equals("scissor") && userchoice.equals("scissor")) {
            System.out.println("Match Draw");
        } else {
            System.out.println("    !! Ivalid input !!  ");
        }
    }
}