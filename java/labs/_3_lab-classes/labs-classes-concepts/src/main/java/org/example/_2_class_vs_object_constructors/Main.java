package org.example._2_class_vs_object_constructors;

public class Main {
    public static void main(String[] args) {
        /*
            To create an object out of a class, we use a keyword new

            Below we create two objects of type Vehicle.

            TODO 2b: run/debug the program - set breakpoints in the main method and the constructors
         */

        // Create an object using a no-arg constructor
        Vehicle vehicle1 = new Vehicle();

        Vehicle vehicle2 = new Vehicle("A message passed to a constructor during object's creation");

        /*
            TODO 2c: vehicle1 and vehicle2 are reference variables.
            They are pointers to objects created in JVM memory.

            Vehicle vehicle1 means - I am a reference variable pointing to an object in JVM memory.
            My type/class in Vehicle. When you type vehicle. IntelliJ will show all the available
            methods and properties that a Vehicle type/class provides.

            There are some methods like toString, equals - we haven't defined any, yet they are.
            They are visible because all classes in Java inherit (directly or indirectly) from the Object class.
            We'll talk about those later (step _7)
         */

        /*
            TODO 2d: when we pass reference variables to System.out.println, it will print
             an object's identifier - some address in JVM memory. Java programmers don't have memory access.

         */

        System.out.println(vehicle1);
        System.out.println(vehicle2);

    }
}
