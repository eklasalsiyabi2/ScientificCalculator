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

        boolean running = true;
        while (running) {
            displayMenu();
            System.out.println("Select a Calculation :");
            int choice = -1;
            try {
                choice = IpReader.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter the number only!");
                IpReader.next();
                continue;
            }
            switch (choice) {
                case 1:
                    performAddition(IpReader);
                    break;
                case 2:
                    performSubtraction(IpReader);
                    break;
                case 3:
                    performMultiplication(IpReader);
                    break;
                case 4:
                    performDivision(IpReader);
                    break;
                case 5:
                    performSquareRoot(IpReader);
                    break;
                case 6:
                    performPower(IpReader);
                    break;
                case 7:
                    performSine(IpReader);
                    break;
                case 8:
                    performCosine(IpReader);
                    break;
                case 9:
                    performTangent(IpReader);
                    break;
                case 0:
                    running = false;
                    System.out.println("Exited from calculator Thank you");
                    break;
                default:
                    System.out.println("Oops, wrong choice.!");

            }
        }

        IpReader.close();
    }

    public static void displayMenu() {
        System.out.println("Operations list");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. * ");
        System.out.println("4. /");
        System.out.println("5. square root  ");
        System.out.println("6. ^");
        System.out.println("7. sin");
        System.out.println("8. cos");
        System.out.println("9. tan");
        System.out.println("0. exit");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sine(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public static double cosine(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }

    public static double tangent(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }

    private static void performAddition(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.println("Enter the first number :");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number :");
            double b = scanner.nextDouble();
            System.out.println("The Resule" + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            scanner.next();
        }
    }
}

