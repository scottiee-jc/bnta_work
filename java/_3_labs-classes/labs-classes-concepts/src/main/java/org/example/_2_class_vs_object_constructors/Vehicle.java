package org.example._2_class_vs_object_constructors;
/*
    TODO 2a: Vehicle is a class with two constructors
    You can think of a constructor as a special kind of method,
    that... constructs an object of a particular class (We will do that in a moment).

    The main difference between a method and a constructor is that a method has a return type, e.g., String, void,
    and a constructor hasn't. The name of the constructor is the same as its class name.

    In our example, we have a class Vehicle that has two constructors:
     - a no-arg constructor
     - a constructor that takes a String parameter

    Let's jump to class org.example._2_class_vs_object_constructors.Main to create two objects out of this class,
    using both constructors and see how they work.
 */
public class Vehicle {

    Vehicle() {
        System.out.println("No-arg constructor - this message is hardcoded in the constructor");
    }

    Vehicle(String msg){
        System.out.println(msg);
    }

}
