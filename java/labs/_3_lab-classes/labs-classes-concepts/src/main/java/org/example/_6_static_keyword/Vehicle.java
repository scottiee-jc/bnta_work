package org.example._6_static_keyword;

public class Vehicle {

    /*
        TODO 6a

        static keyword + a property means a value of a property is shared across all objects of the same type/class
        Usually, static properties are public, the naming convention ALL_CAPITAL_LETTERS_WITH_UNDERSCORE

        A real-life example: MATH.PI
     */

    public static String A_STATIC_VARIABLE = "This is the same value shared across all objects of the same class";

    private String kind;

    public Vehicle(String kind) {
        this.kind = kind;
    }


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String startEngine(){
        return "The engine of a " + kind + " has started!";
    }

    /*
        TODO 6b

        static keyword + a method means two things:
        - a code from a static method cannot access non-static elements of a class (properties, methods)

        Compare startEngine, an instance method, to a static noObjectsDataInvolved method.

        An instance method belongs to an object, and usually, some characteristics (data/properties)
        of this object are involved in the method's logic.

        On the other hand, a static method does not care about the object's characteristics since it
        cannot even access it.

        A real-life example: Math.pow(10d, 15d);
     */

        public static String noObjectsDataInvolved(String externalData) {
            return externalData.toUpperCase();
        }

        /*
        TODO 6b

        This class, in a UML diagram, would look like this (static prop/method is underscored)

        +---------------------------------------------------+
        |                       Vehicle                     |  <- name of the class
        +---------------------------------------------------+
        | A_CONSTANS: String                                |
        | -------------------                               |  <- properties section
        | kind: String                                      |
        +---------------------------------------------------+
        | noObjectsDataInvolved(String externalData):String |
        | ------------------------------------------------- |
        | startEngine(): void                               |  <- methods section
        +---------------------------------------------------+

     */

    // Jump to the main method
}