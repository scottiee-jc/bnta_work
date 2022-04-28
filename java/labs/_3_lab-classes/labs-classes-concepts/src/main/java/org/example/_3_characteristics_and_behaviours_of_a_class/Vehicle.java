package org.example._3_characteristics_and_behaviours_of_a_class;

public class Vehicle {

    /*
        TODO 3a: implicit no-arg constructor
        The Java compiler will add a no-arg constructor when you don't explicitly implement any constructors.
        An object of this class can be created like this: Vehicle v = new Vehicle();

     */


    /*
        TODO 3b: a property (characteristic)
     */
    String kind = "car";

    /*
        TODO 3c: a method (behaviour)
     */
    String startEngine(){
        return "The engine of a " + kind + " has started!";
    }

    /*
        TODO 3d:
        UML class diagram is used to represent a class in a graphical way, which can
        be very useful when communicating with other developers or, e.g., business analysts.

        This class, in a UML diagram, would look like this:

        +------------------------+
        |         Vehicle        |  <- name of the class
        +------------------------+
        | kind: String           |  <- properties section
        +------------------------+
        | startEngine(): void    |  <- methods section
        +------------------------+

     */

    // Jump to the main method

}
