package org.example._4_public_vs_private_getters_and_setters;

public class Main {
    /*
        TODO 4b: create a Vehicle object and try to access its property directly, e.g., v.getKind() - it's impossible
        because the property itself is private. So let's use getter and setter to access the property
     */


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.getKind());
        System.out.println(v.startEngine());

        v.setKind("boat");
        System.out.println(v.startEngine());
    }
}
