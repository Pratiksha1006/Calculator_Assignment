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

                if (choice >= 6) {
                    opeartionForSingleOperand(choice);
                } else {
                    opeartionForDoubleOperand(choice);
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input ,Please enter a valid number.");
                //System.out.println("Enter any key for countinue opeartion ");
               scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    private static void opeartionForDoubleOperand(int choice) {
        Calculator op = new Calculator();
        switch (choice) {
            case 1:
                System.out.println(op.Addition());
                break;
            case 2:
                System.out.println(op.Subtraction());
                break;
            case 3:
                System.out.println(op.Multiplication());
                break;
            case 4:
                System.out.println(op.Division());
                break;
            case 5:
                System.out.println(op.Percentage());
                break;
            default:
                throw new IllegalArgumentException("Please check Your choice ");

        }
    }
    private static void opeartionForSingleOperand(int choice) {
        Calculator op = new Calculator();
        switch (choice) {
            case 6:
                System.out.println(op.Square());
                break;
            case 7:
                System.out.println(op.SquareRoot());
                break;
            default:
                throw new IllegalArgumentException("Please check Your choice ");
        }
    }
}
