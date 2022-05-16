package org.examples.streamapi._1;

import org.junit.jupiter.api.Test;

import static org.examples.streamapi.TestUtil.PEOPLE;

public class ForEachTest {
    @Test
    void printOutNamesAllCaps_comments(){
        PEOPLE
                .forEach(
                      /*
                        To help you understand the lambda's syntax
                        You may start with this and use IntelliJ to simplify the expression.
                     */
                        person -> System.out.println(person.getName().toUpperCase())
                );
    }

    @Test
    void printOutAllCaps(){
        PEOPLE.forEach(person -> System.out.println(person.getName().toUpperCase()));
    }
    // passing 'person' to the fora,ge method to be accessed and printed in upper case

    // Time for some practice: print out, in separate tests: lastName, age, Gender.
}
