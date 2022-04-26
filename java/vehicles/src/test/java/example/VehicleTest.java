package example;

import org.junit.jupiter.api.Test;

import java.util.List;


class VehicleTest {

    @Test
    void testVehicleList() {
        /*
            List <Vehicle> vehicles => we can add only objects of type Vehicle (only classes that implement the Vehicle interface).

            Check the code below - a compiler error
            List<Vehicle> vehiclesWithApple = List.of(new Car(), new Apple());
         */

        List<Vehicle> vehicles = List.of(new Car(), new Boat(), new Plane());


        //  ref type|ref name| list of Vehicles (car, boat, plane)
        for (Vehicle vehicle: vehicles) {
            // The reference type - which methods can we call. Vehicle type gives us one method only, no matter the actual objects' class
            vehicle.startEngine();
            // Let's check the actual type of an object
            if(vehicle instanceof Car) {
/*
                ((Car) vehicle).isTheLightOn();

                Line 29 is an equivalent of line 39, 40
 */
                /*
                       If an object's type is Car, we can call Car's specific methods.
                        Since the reference type gives us available methods,
                        we need to have another reference pointing to the same object (of type Car),
                        but this time the reference's type will give us access to all Car's methods
                 */
                Car car = (Car) vehicle;
                car.isTheLightOn();
            } else if (vehicle instanceof Boat) {
                Boat boat = (Boat)vehicle;
                boat.raiseTheSail();
            } else if (vehicle instanceof Plane) {
                Plane plane = (Plane) vehicle;
                plane.deployLandingGear();
            }
        }
    }

}
