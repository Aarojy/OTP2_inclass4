package laskin;

import java.util.Scanner;
import java.util.logging.Logger;

public class Laskin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Logger logger = Logger.getLogger(Laskin.class.getName());

        logger.info("Enter first number:");
        double num1 = input.nextDouble();

        logger.info("Enter second number:");
        double num2 = input.nextDouble();

        double resultAdd = add(num1, num2);
        logger.info(()->"The sum is: " + resultAdd);
        double resultSubstract = subtract(num1, num2);
        logger.info(()->"The difference is" + resultSubstract);
        double resultMultiply = multiply(num1, num2);
        logger.info(()->"The product is: " + resultMultiply);
        double resultDivide = divide(num1, num2);
        logger.info(()->"The quotient is: " + resultDivide);
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
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
