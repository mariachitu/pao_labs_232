package firstPackage;

import java.util.Random;
import java.util.Scanner;

//import java.util.*;

/**
 *  java.util
 *  java.lang
 */

// PIC

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");

        int number = scanner.nextInt();
        System.out.println("result is " + number);

        System.out.print("Enter number:");
        double number2 = scanner.nextDouble();
        System.out.println("result is " + number2);

        System.out.print("Enter string:");
        String str = scanner.next();
        System.out.println("result is " + str);

        Random random = new Random();
        int number10 = random.nextInt(10);
        System.out.println(number10);

    }
}
