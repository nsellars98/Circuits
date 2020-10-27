import java.util.Objects;

/**
 * Homework 7 Solution.
 *
 * The class with the Circuit superclass.
 *
 * @author Nathan C. Sellars
 */
public abstract class Circuit {

    /**
     * Gets the resistance of this {@code Circuit}.
     *
     * @return The resistance of this {@code Circuit}.
     */
    public abstract double getResistance();

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Circuit)) return false;
        var that = (Circuit) object;
        return Objects.equals(this.getResistance(), that.getResistance());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getResistance());
    }

    /**
     * Returns a format String for the getResistance() method.
     *
     * @return A format String representation of this {@code Circuit}.
     */
    @Override
    public String toString() {
        //return String.valueOf(this.getResistance());
        return String.format("%.2f", this.getResistance());
    }
}