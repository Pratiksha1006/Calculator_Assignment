package Calculator_assignment;


import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Calculator {
    abstract double calculate();
}
// Concrete classes
class Addition extends Calculator {
    @Override
    double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double sum = 0;
        double num = 1;
        while (num != 0) {
            num = sc.nextDouble();
            sum = sum + num;
        }
        System.out.print("Addition : ");
        return sum;
    }
}
class Subtraction extends Calculator {
    @Override
    double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double sub = 0;
        double num = 1;
        int total=0;
        while (num != 0) {
            num = sc.nextDouble();
            if(total==0){
                total++;
                sub=num;
            }
            else{
                sub = sub - num;
            }
        }
        //System.out.print("Subtraction : ");
        return sub;
    }
}
class Multiplication extends Calculator {
    @Override
    double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double mul = 1;
        double num = 0;
        while (num != 1) {
            num = sc.nextInt();
            mul = mul *num;
        }
        System.out.print("Multiplication : ");
        return mul;
    }
}
class Division extends Calculator {

    @Override
    double calculate() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numerator : ");
        double x=sc.nextInt();
        System.out.print("Enter Denominator  : ");
        double y=sc.nextInt();
        System.out.print("Division : ");
        {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        }
    }
}
class Percentage extends Calculator {
    double calculate() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double x=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        double y=sc.nextInt();
        System.out.print("Percentage : ");
        return (x * y) / 100;
    }
}
class Square extends Calculator {
    double calculate() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        double x=sc.nextInt();
        System.out.print("Square: ");
        return Math.pow(x, 2);
    }
}
class SquareRoot extends Calculator {
    double calculate() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        double x=sc.nextInt();
        if (x < 0) {
            throw new ArithmeticException("Square root of a negative number is undefined");
        }
        System.out.print("Square Root : ");
        return Math.sqrt(x);
    }
}
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
                System.out.println("Enter any key for countinue opeartion ");
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
