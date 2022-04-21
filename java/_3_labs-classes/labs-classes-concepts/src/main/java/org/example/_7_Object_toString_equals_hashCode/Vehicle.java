package org.example._7_Object_toString_equals_hashCode;

import java.util.Objects;

public class Vehicle {

    private String kind;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getKind(), vehicle.getKind());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKind());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "kind='" + kind + '\'' +
                '}';
    }
}