package pac;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * This code defines a custom exception class, CounterMaxException, and a static method, readIntFunc,
 * that reads an integer value from the user using a Scanner object. The readIntFunc method checks
 * whether the input is a positive integer and prompts the user to enter a new value if the input
 * is invalid. If the user enters an invalid input, the method consumes it and prompts the user
 * to enter a new input. If the user enters an input that is too large, a CounterMaxException is
 * thrown with an appropriate error message.
 */

public class CounterMaxException extends Exception {
    public CounterMaxException(String message) {
        super(message);
    }

    public static int readIntFunc(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    return value;
                }
            } catch (InputMismatchException e) {
                scanner.next(); // Consume the invalid input
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }


}
