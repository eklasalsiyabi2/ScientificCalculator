import javax.swing.plaf.PanelUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner IpReader = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = IpReader.nextLine();

        System.out.println("Enter your Age :");
        int age = IpReader.nextInt();

        System.out.println("Enter your height in meters (e.g., 1.75): ");
        double H = IpReader.nextDouble();

        System.out.println("Hello," + name);
        System.out.println("Your age" + age + "years old.");
        System.out.println("And you are " + H + " meters tall.");


        IpReader.close();
    }
}


