/**
 * Homework 7 Solution.
 *
 * The class with the main method.
 *
 * @author Nathan C. Sellars
 */
public class Main {

    /**
     * The starting point for this application.
     *
     * @param args optional command line arguments (unused in this application).
     */
    public static void main(String[] args) {

        /**
         * TEST CASE ONE
         */
        var circuit1 = new Parallel();
        circuit1.add(new Resistor(100));
        var circuit2 = new Serial();
        circuit2.add(new Resistor(100));
        circuit2.add(new Resistor(200));
        circuit1.add(circuit2);
        System.out.printf("Combined Resistance: %s", circuit1);

        /**
         * TEST CASE TWO
         */
//        var circuit1 = new Serial();
//        circuit1.add(new Resistor(300));
//        circuit1.add(new Resistor(450));
//        var circuit2 = new Parallel();
//        circuit2.add(new Resistor(275));
//        circuit2.add(new Resistor(125));
//        System.out.printf("Combined Resistance: %s", circuit1);

        /**
         * TEST CASE THREE
         */
//        var circuit1 = new Parallel();
//        circuit1.add(new Resistor(25.72));
//        circuit1.add(new Resistor(31.41));
//        var circuit2 = new Parallel();
//        circuit2.add(new Resistor(112.58));
//        circuit2.add(new Resistor(87.98));
//        System.out.printf("Combined Resistance: %s", circuit1);
    }
}