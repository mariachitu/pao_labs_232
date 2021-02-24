package firstPackage;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul termen: ");
        int value1 = scanner.nextInt();
        System.out.println("Introduceti al doilea termen: ");
        int value2 = scanner.nextInt();
        System.out.println("Introduceti operatia ");
        String operation = scanner.next();

        switch (operation) {
            case "sum":
                System.out.println("Result = " + (value1 + value2));
                break;
            case "diff":
                System.out.println("Result = " + (value1 - value2));
                break;
            case "mult":
                System.out.println("Result = " + (value1 * value2));
                break;
            case "div":
                System.out.println("Result = " + (value1 / value2));
                break;
            default:
                System.out.println("Undefined operation");
        }

    }
}
