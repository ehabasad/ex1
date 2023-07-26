package pac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static pac.CounterMaxException.readIntFunc;

/**
 * Main program for the simple Counter class.
 * Read numbers from standard input and adds them to the counter.
 * Prints the final count and exits.
 */
public class Main {
    public static void main(String[] args) throws CounterMaxException {
        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter the number of values to add to the counter.
        // read the number of numbers to add
        int count = readIntFunc(scanner,"Enter the number of values to add:" );


        // create a list to store the numbers
        List<Integer> numbers = new ArrayList<>();

        // read the numbers and add them to the list
        for (int i = 0; i < count; i++) {
            int value = readIntFunc(scanner,"Enter value " + (i + 1) + ": ");
            numbers.add(value);
        }

        // create a counter and add the numbers to it
        Counter counter = new Counter();
        for (int n : numbers) {
            counter.increment(n);
        }

        // print the counter value and the list of numbers
        System.out.printf("%d (%d numbers:", counter.getValue(), count);

        for (int n : numbers) {
            System.out.printf(" %d", n);
        }
        System.out.println(")");
    }
}
