package Calculator_assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator_operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Calculator");

        while (true) {
            //Menu
            System.out.println("------------------------------------------------------");
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Square");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.println("------------------------------------------------------");

            try {
                System.out.print("Please Enter Your Choice : ");
                int choice = scanner.nextInt();

                if (choice == 8) {
                    System.out.println("Exiting calculator.");
                    break;
                }
                double output ;
                if (choice >= 6) {
                    //for square and square root
                    output=opeartionForSingleOperand(choice);
                } else {
                    output=opeartionForDoubleOperand(choice);
                }
                //result
                System.out.println(output);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ,Please enter a valid number.");
                //System.out.println("Enter any key for countinue opeartion ");
               scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    private static double opeartionForDoubleOperand(int choice) {
        Calculator calculator;
        switch (choice) {
            case 1:
                //System.out.print("Addition : ");
                calculator = new Addition();
                break;
            case 2:
                calculator = new Subtraction();
                break;
            case 3:
                //System.out.print("Multiplication : ");
                calculator = new Multiplication();
                break;
            case 4:
                //System.out.print("Division : ");
                calculator = new Division();
                break;
            case 5:
                //System.out.print("Percentage : ");
                calculator = new Percentage();
                break;
            default:
                throw new IllegalArgumentException("Please check Your choice ");

        }
        return calculator.calculate();
    }
    private static double opeartionForSingleOperand(int choice) {
        Calculator calculator;
        switch (choice) {
            case 6:
                //System.out.print("Square: ");
                calculator = new Square();
                break;
            case 7:
                //System.out.print("Square Root : ");
                calculator = new SquareRoot();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
        return calculator.calculate(); // take 0 as second number
    }
}
