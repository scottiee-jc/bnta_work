package org.example._7_Object_toString_equals_hashCode;

public class Main {
    public static void main(String[] args) {
        /*
            TODO 7a equals & hashCode:
            - create 2 objects of type Vehicle, pass "car" to a constructor for both objects
            - run the program and see the output of System.out.println(car1.equals(car2));
            - generate equals & hashCode in Vehicle
            - rerun the program and see the output - is there a difference?

         */
        Vehicle car1 = new Vehicle("car");
        Vehicle car2 = new Vehicle("car");
        System.out.println(car1.equals(car2));

        /*
            TODO 7b toString:
            - pass car1 to System.out.println, run the program and see the output
            - generate toString, rerun and see the output - is there a difference?
         */
        System.out.println(car1);

    }
}
