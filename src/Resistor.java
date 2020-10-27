/**
 * Homework 7 Solution.
 *
 * The class with the Resistor subclass.
 *
 * @author Nathan C. Sellars
 */
public final class Resistor
        extends Circuit {

    /**
     * A placeholder value for the setResistance() method.
     */
    private static final int ZER0 = 0;

    /**
     * The minimum resistance value a resistor can have.
     */
    private static final double MINIMUM_RESISTANCE  = 1.0;

    /**
     *  The resistance of this {@code Resistor}.
     */
    private double resistance;

    /**
     * Constructs and initializes a new Resistor
     * with the given resistance value.
     * If the resistance is less than
     * {@link Resistor#MINIMUM_RESISTANCE},
     * then MINIMUM_RESISTANCE is used.
     *
     * @param resistance the resistance of this
     * {@code Resistor}.
     */
    public Resistor(double resistance) {
        this.setResistance(resistance);
    }

    /**
     * Gets the resistance of this {@code Resistor}.
     *
     * @return The resistance of this {@code Resistor}.
     */
    @Override
    public double getResistance() {
        return this.resistance;
    }

    /**
     * Sets the resistance of this {@code Resistor} to
     * the given value. If the given resistance value
     * is less than {@link Resistor#MINIMUM_RESISTANCE},
     * then MINIMUM_RESISTANCE is used.
     *
     * @param resistance the resistance value of this
     * {@code Resistor}.
     */
    private void setResistance(double resistance) {
        this.resistance =
                Double.compare(
                        resistance, MINIMUM_RESISTANCE) >= ZER0
                        ? resistance :
                        MINIMUM_RESISTANCE;
    }
}