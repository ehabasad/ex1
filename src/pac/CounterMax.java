package pac;

/**
 * A class representing a counter with a maximum value that can be incremented by a specified amount.
 */
public class CounterMax extends Counter {
    private int maxValue; // maximum value of the counter

    /**
     * Initializes the counter to 0 and sets the maximum value.
     *
     * @param maxValue the maximum value of the counter
     */
    public CounterMax(int maxValue) {
        super();
        this.maxValue = maxValue;
    }

    /**
     * Adds the specified amount to the counter.
     *
     * @param n the amount to add to the counter (must be non-negative)
     * @throws CounterMaxException if the counter value exceeds the maximum value
     */
    @Override
    public void increment(int n) throws CounterMaxException {
        if (this.getValue() + n > this.maxValue) {
            throw new CounterMaxException("Counter value exceeded maximum value");
        }
        super.increment(n);
    }

    /**
     * Prints a complete message about the current counter with its maximum value.
     */
    @Override
    public void print() {
        System.out.println("Counter value: " + this.getValue() + ", Maximum value: " + this.maxValue);
    }
}
