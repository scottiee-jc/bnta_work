package org.example._4_public_vs_private_getters_and_setters;

public class Vehicle {
    /*
        TODO 4a: in Java, there are 4 access modifiers:
         public, protected, default (no modifier, package-private and private)

         To simplify, you can think that any method or property can be public
         or private. Public means it's visible everywhere in the code, private (depending on the privacy level)
         either it is visible in the class it's defined or only in some places of the code.

         Long story short, you want to make the properties of a class private and add some special methods,
         that allow accessing the properties - getters and setters. As you can see in the setter/getter methods,
         'this' keyword is used - it'll be explained in step _5.

         We will exercise a bit more the access modifiers in step _8

     */

    private String kind = "car";

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

        This class, in a UML diagram, would look like this
        (getters and setters are usually omitted in a UML diagram)

            +------------------------+
            |         Vehicle        |  <- name of the class
            +------------------------+
 - private  | - kind: String         |  <- properties section
            +------------------------+
 + public   | + startEngine(): void  |  <- methods section
            +------------------------+

     */

    // Jump to the main method

}
