import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int score = sc.nextInt();
        switch (score / 10) {
            case 10:
                System.out.println("You have got A+");
                break;
            case 9:
                System.out.println("yout have got A+");
                break;
            case 8 : 
                System.out.println("You have got ");

        }
    }
}
