package Calculator_assignment;

import java.util.Scanner;

abstract class CalculatorOperations {
    abstract double Addition();
    abstract double Subtraction();
    abstract double Multiplication();
    abstract double Division();
    abstract double Percentage();
    abstract double Square();
    abstract double SquareRoot();


}

class Calculator extends CalculatorOperations {
    @Override
    double Addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("{ Press 0 to get addition }");
        System.out.print("Enter numbers: ");
        double sum = 0;
        double num = 1;
        while (num != 0) {
            num = sc.nextDouble();
            sum = sum + num;
        }
        System.out.print("Addition : ");
        return sum;
    }


    @Override
    double Subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("{ Press 0 to get subtraction }");
        System.out.print("Enter numbers: ");
        double sub = 0;
        double num = 1;
        int total = 0;
        while (num != 0) {
            num = sc.nextDouble();
            if (total == 0) {
                total++;
                sub = num;
            } else {
                sub = sub - num;
            }
        }
        return sub;
    }


    @Override
    double Multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("{ Press 1 to get multiplication }");
        System.out.print("Enter number: ");
        double mul = 1;
        double num = 0;
        while (num != 1) {
            num = sc.nextInt();
            mul = mul * num;
        }
        System.out.print("Multiplication : ");
        return mul;
    }


    @Override
    double Division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numerator : ");
        double x = sc.nextInt();
        System.out.print("Enter Denominator  : ");
        double y = sc.nextInt();
        System.out.print("Division : ");
        {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        }
    }


    double Percentage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double x = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        double y = sc.nextInt();
        System.out.print("Percentage : ");
        return (x * y) / 100;
    }


    double Square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double x = sc.nextInt();
        System.out.print("Square: ");
        return Math.pow(x, 2);
    }


    double SquareRoot() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double x = sc.nextInt();
        if (x < 0) {
            throw new ArithmeticException("Square root of a negative number is undefined");
        }
        System.out.print("Square Root : ");
        return Math.sqrt(x);
    }
}