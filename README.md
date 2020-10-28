# Circuits
An app using classes and inheritance to solve a complex problem and model something seen in the real world.

This app is constructed with an abstract superclass "Circuit" and subclasses "Resistor", "Serial", and "Parallel". The "Circuit" superclass contains a "getResistance" method that MUST be overridden in the subclasses for this app to work properly through the inheritance hierarchy. Each subclass contains other methods as needed.

The "Resistor" subclass represents a single resistor.

A Serial circuit models a series of circuits, each of which can be a single resistor or another circuit. The "Serial" subclass models this type of circuit. Similarly, a Parallel circuit models a list of circuits in parallel. The "Parallel" subclass models this type of circuit. Both of these subclasses contain a List<Circuit>.

The starting point for this app ("main") models a few different circuit combinations (series and parallel). When the main method is run, the uncommented circuit resistance gets calculated. Ohm's Law is used to calculate the resistance. For example, the resistance for a series circuit is the sum of the resistance values of the circuits. For a parallel circuit, the resistance is 1/Rt = 1/R1 + 1/R2 + 1/R3... and so forth.

All core app files can be located in the "src" folder.

Proof of test cases can be found in the corresponding Word document along with screenshots showing the code when running. Additionally, models of the circuits found in the code are used for reference and hand-worked calculations for the resistances are provided to show the code works as expected.

This app was developed with JetBrains IntelliJ IDEA (various versions).

Thanks for looking!
