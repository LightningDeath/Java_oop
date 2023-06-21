import java.util.Scanner;

import static java.lang.System.exit;

public class CalcView {
    private Scanner in;

    public CalcView() {
        this.in = new Scanner(System.in);
    }

    double getNumber1() {
        try {
            System.out.print("Enter number: ");
            return in.nextDouble();
        } catch (Exception e) {
            System.out.println("Error! Use only numbers!");
            getNumber1();
        }
        return 0;
    }

    double getNumber2() {
        try {
            System.out.print("Enter number: ");
            double a = in.nextDouble();
            if (a == 0) {
                System.out.println("Error! Division by zero! Use another number.");
                return getNumber2();
            } else {
                return a;
            }
        } catch (Exception e) {
            System.out.println("Error! Use only numbers!");
            return getNumber2();
        }
    }

    String getOperator() {
        try {
            System.out.print("Enter operator: ");
            String c = in.nextLine();
            if (c.equalsIgnoreCase("*") || c.equalsIgnoreCase("/") ||
                    c.equalsIgnoreCase("-") || c.equalsIgnoreCase("+")) {
                return c;
            } else if (c.equalsIgnoreCase("Exit")) {
                exit(0);
                return "";
            } else {
                System.out.println("Error! Use only '*', '/', '+', '-'.");
                return getOperator();
            }
        } catch (Exception e) {
            System.out.println("Error! Use only '*', '/', '+', '-'.");
            return getOperator();
        }
    }

    void displayResult(double result) {
        System.out.println("Result: " + result);
        System.out.println();
    }
}
