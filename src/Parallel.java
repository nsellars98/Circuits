import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Homework 7 Solution.
 *
 * The class with the Parallel subclass
 *
 * @author Nathan C. Sellars
 */
public final class Parallel
        extends Circuit {

    /**
     * The value to represent the sum index of 0.
     */
    private static final double SUM_INDEX = 0.0;

    /**
     * The Ohm's Law resistance inverse number that is first used to
     * halve the resistance value of each individual circuit,
     * and second, is divided by the sum of the circuits to
     * calculate the total resistance of any number of circuits
     * in parallel.
     */
    private static final int RESISTANCE_INVERSE = 1;

    /**
     * The circuit object List to maintain this
     * {@code Parallel} Circuit.
     */
    private List<Circuit> circuits;

    /**
     * Creates and instantiates a List of
     * type <code>Parallel</code> Circuit
     * with the use of a temporary variable.
     */
    public Parallel() {
        this.circuits = new ArrayList<>();
    }

    /**
     * Adds a Parallel circuit to this
     * {@code Parallel} Circuit.
     *
     * @param circuit the new parallel circuit
     * for this {@code Parallel} Circuit.
     */
    public void add(Circuit circuit) {
        Objects.requireNonNull(circuit, "This parallel circuit cannot be null.");
        this.circuits.add(circuit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResistance() {
        var sum = SUM_INDEX;
        for (var circuit : this.circuits) {
            sum +=  RESISTANCE_INVERSE / circuit.getResistance();
        }
        return RESISTANCE_INVERSE / sum;
    }
}