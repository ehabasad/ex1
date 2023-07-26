package pac;


/**
 * A class representing a counter that can be incremented by a specified amount.
 */
public class Counter implements Printable {
    private int value; // current value of the counter

    /**
     * Initializes the counter to 0.
     */
    public Counter() {
        this.value = 0;
    }

    /**
     * Adds the specified amount to the counter.
     *
     * @param n the amount to add to the counter (must be non-negative)
     */
    public void increment(int n) throws CounterMaxException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        this.value += n;
    }

    /**
     * Returns the current value of the counter as a string.
     *
     * @return the current value of the counter
     */
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    /**
     * Returns the current value of the counter.
     *
     * @return the current value of the counter
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Prints a complete message about the current counter.
     */
    @Override
    public void print() {
        System.out.println("Counter value: " + this.value);
    }
}
