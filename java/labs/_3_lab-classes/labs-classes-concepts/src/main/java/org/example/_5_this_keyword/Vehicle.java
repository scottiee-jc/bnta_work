package org.example._5_this_keyword;

public class Vehicle {

    /*
        TODO 5a

        In the previous examples of a Vehicle class, the kind property was hardcoded.
        Let's set it while creating an object - let's use a parameterized constructor.

        When we add a parameterized constructor, the java compiler won't add a no-arg constructor.
        You can test it in the main method - you can't create a Vehicle object using 'new Vehicle()',
        only new Vehicle("a string needs to be passed to a parametrized constructor")

     */

    private String kind;

    /*
        TODO 5b
        Let's look at the below constructor:
        kind vs this.kind

        kind is a String passed while calling Vehicle's constructor: new Vehicle("a string")
        this.kind is the Vehicle's property defined in line 17

        Create two objects in the main method, put a breakpoint in the constructor and
        observe the value of 'this' - it will change since 'this' points to a current object.

        Let's look at the below lines of code:

        Vehicle car1 = new Vehicle(); // car1 points to a Vehicle object
        Vehicle car2 = new Vehicle(); // car2 points to another Vehicle object

        this.kind (inside Vehicle class)    // this points to an object of type Vehicle
                                            // It may be car1, car2, or any other object of this type
     */
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
}
