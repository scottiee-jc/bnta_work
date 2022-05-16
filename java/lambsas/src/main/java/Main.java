public class Main {
    public static void main(String[] args) {

        // Reference type - what method can we call on an object
        // Vehicle car;

        // the implementation - how the method will behave
        // new Car();
        // new Boat();

        // 3 implementations of the same interface: 2 classes and one lambda

        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle lambdaImplementation = () -> {
            System.out.println("Lambda implementation is moving!");
        };

        // lambda is an implementation of a functional interface
        // lambdas can only implement FUNCTIONAL interfaces, i.e. an interface with only one abstract method
        // we can have other methods with more concrete implementations, i.e. ones in which there is a body / parameters

        /*
            Pass an object to a useVehicle method (the object must pass IS A test (instanceof)
            useVehicle(Vehicle vehicle) <- compiler will allow Vehicles only since the methods
            param type is Vehicle
         */

        System.out.println(car instanceof Vehicle);
        System.out.println(boat instanceof Vehicle);
        System.out.println(lambdaImplementation instanceof Vehicle);

        useVehicle(car);
        useVehicle(boat);
        useVehicle(lambdaImplementation);

    }

    static void useVehicle(Vehicle vehicle) {
        // Call a method on the reference (is of type Vehicle
        // but each time we're calling a different implementation)

        vehicle.go();
    }
}
/*
    A functional interface is an interface with one method only
    every lambda in Java is an implementation of such an interface
 */
@FunctionalInterface
interface Vehicle {
    // The contract: name of the method, what it returns and what argument it accepts
    void go();
}

// implements: I declare to provide a method's implementation,
// therefore, I'll pass the instanceof test
class Car implements Vehicle{

    @Override
    public void go() {
        System.out.println("The car is moving!");
    }
}

class Boat implements Vehicle {

    @Override
    public void go() {
        System.out.println("The boat is moving!");

    }
}
