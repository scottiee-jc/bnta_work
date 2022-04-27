package org.example._6_static_keyword;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle("car");
        Vehicle truck = new Vehicle("truck");

        /*
            TODO 6c:  How to properly access/call a static property/method
         */

        // To access a static member of a class, we use the class name, dot, and the member
        String aConstantFromVehicleAccessedTheRightWay = Vehicle.A_STATIC_VARIABLE;
        String aValueFromAStaticMethodAccessedTheRightWay = Vehicle.noObjectsDataInvolved("x");
        /*
            We can access a static member using a reference variable, but this way is misleading
            to an experienced fellow developer since using a reference variable and dot is
            a way of accessing instance properties and methods
         */
        String aConstantFromVehicleAccessedInAMisleadingWay = car.A_STATIC_VARIABLE;
        String aValueFromAStaticMethodAccessedInAMisleadingWay = car.noObjectsDataInvolved("x");


        /*
            TODO 6d: instance vs static property

         */
        System.out.println("################ Instance ###################");
        System.out.println("Instance property 'kind' of car object and truck object, before a change:");
        System.out.println("car.getKind(): " + car.getKind());
        System.out.println("truck.getKind(): " + truck.getKind());
        System.out.println();

        System.out.println("Setting the value using: car.setKind(\"Volvo\");");
        car.setKind("Volvo");
        System.out.println();

        System.out.println("Instance property 'kind' of car object and truck object, after the change:");
        System.out.println("car.getKind(): " + car.getKind());
        System.out.println("truck.getKind(): " + truck.getKind());
        System.out.println();
        System.out.println("################ Static ###################");

        System.out.println();
        System.out.println("Static A_STATIC_VARIABLE, before a change");
        System.out.println("car.A_STATIC_VARIABLE: " + car.A_STATIC_VARIABLE);
        System.out.println("truck.A_STATIC_VARIABLE: " + truck.A_STATIC_VARIABLE);
        System.out.println();

        System.out.println("Setting the value using: car.A_STATIC_VARIABLE=\"a new value\"");
        car.A_STATIC_VARIABLE="a new value";


        System.out.println("Static A_STATIC_VARIABLE, after the change");
        System.out.println("car.A_STATIC_VARIABLE: " + car.A_STATIC_VARIABLE);
        System.out.println("truck.A_STATIC_VARIABLE: " + truck.A_STATIC_VARIABLE);


    }
}
