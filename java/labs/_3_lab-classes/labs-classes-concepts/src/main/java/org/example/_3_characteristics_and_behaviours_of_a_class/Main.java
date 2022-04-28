package org.example._3_characteristics_and_behaviours_of_a_class;

public class Main {
    public static void main(String[] args) {
        // TODO 3e: let's use properties and methods of an object

        // The below line creates an object of type Vehicle using a no-arg, implicit constructor

        Vehicle vehicle = new Vehicle();

        /*
            Let's:
            1. get a variable's value from the object and
            2. print it to the console
         */

        String vehicleKind = vehicle.kind;
        System.out.println(vehicleKind);

        /*
            Let's:
            1. call the object's method,
            2. assign the returned value to a variable and
            3. print the value to the console
         */

        String aValueReturnedFromTheMethod = vehicle.startEngine();
        System.out.println(aValueReturnedFromTheMethod);


    }
}
