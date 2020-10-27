import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Homework 7 Solution.
 *
 * The class with the Serial subclass.
 *
 * @author Nathan C. Sellars
 */
public final class Serial
        extends Circuit {

    /**
     * The value to represent the sum index of 0.
     */
    private static final double SUM_INDEX = 0.0;

    /**
     * The circuit object List to maintain this
     * {@code Serial} Circuit.
     */
    private List<Circuit> circuits;

    /**
     * Creates and instantiates a List of
     * type <code>Serial</code> Circuit with
     * the use of a temporary variable.
     */
    public Serial () {
        this.circuits = new ArrayList<>();
    }

    /**
     * Adds a serial circuit to this
     * {@code Serial} Circuit.
     *
     * @param circuit the new serial circuit
     * for this {@code Serial} Circuit.
     */
    public void add(Circuit circuit) {
        Objects.requireNonNull(circuit, "This serial circuit cannot be null.");
        this.circuits.add(circuit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getResistance() {
        var sum = SUM_INDEX;
        for (var circuit : this.circuits) {
            sum += circuit.getResistance();
        }
        return sum;
    }
}