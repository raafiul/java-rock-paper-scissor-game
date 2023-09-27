import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        System.out.print("Enter the mark of Physics : ");
        double Physics = marks.nextDouble();
        System.out.print("Enter the mark of Mathematics : ");
        double Math = marks.nextDouble();
        System.out.print("Enter the mark of Chemistry : ");
        double chem = marks.nextDouble();
        System.out.print("Enter the mark of Digital Electronics-2 : ");
        double de = marks.nextDouble();
        System.out.print("Enter the mark fo DSA : ");
        double dsa = marks.nextDouble();
        double totalmarks = Physics + Math + chem + de + dsa;
        double percentage = (totalmarks / 500) * 100;
        System.out.println("Your total mark is : " + totalmarks);
        System.out.print("Your percentage is " + percentage + "%");
        marks.close();
    }
}
