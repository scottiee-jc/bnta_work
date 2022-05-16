package org.examples.streamapi.model;

import java.util.function.Predicate;

public class Person {

    public enum Gender {
        MALE, FEMALE, NON_BINARY, UNKNOWN
    }

    private String name;
    private String lastName;
    private int age;
    private Gender gender;

    public Person(String name, String lastName, int age, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static Predicate<Person> ageMoreThan30 = (person) -> person.getAge() > 30;

    public static Predicate<Person> ageLessThan20 = (person) -> person.getAge() < 20;

    // creating a method for these predicates using lambdas
    // now we can use these in the test code
}
