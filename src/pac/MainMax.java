package pac;
import java.util.Scanner;
import static pac.CounterMaxException.readIntFunc;

/**
 * This class reads input from the console to create and use a CounterMax object.
 * It prompts the user to enter the maximum value for the counter, the number of values to add,
 * and the values themselves. If the maximum value is reached, the program will exit with an exception.
 * It also implements the Printable interface to print information about the CounterMax object.
 */
public class MainMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the maximum value for the counter.
        int maxValue = readIntFunc(scanner,"Enter the maximum counter value: ");;

        // Create a CounterMax object with the given maximum value.
        CounterMax counter = new CounterMax(maxValue);

        // Prompt the user to enter the number of values to add to the counter.
        int numValues = readIntFunc(scanner,"Enter the number of values to add:" );

        // Add the values to the counter.
        for (int i = 0; i < numValues; i++) {
            int value = readIntFunc(scanner,"Enter value " + (i + 1) + ": ");
            try {
                counter.increment(value);
            } catch (CounterMaxException e) {
                System.out.println("Maximum counter value reached.");
                break;
            }
        }

        // Print information about the counter.
        counter.print();

        scanner.close();
    }
}

