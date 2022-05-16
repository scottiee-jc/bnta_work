package org.examples.streamapi._3;


import org.examples.streamapi.model.Person;
import org.examples.streamapi.model.PersonDTO;
import org.junit.jupiter.api.Test;

import java.awt.datatransfer.StringSelection;
import java.util.List;

import static org.examples.streamapi.TestUtil.PEOPLE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {

   /* Time for some practice:
            - map to List<Integers> (age)
            */
    @Test
    void mapPersonObjectsToAges_comments() {
        List<Integer> ages = PEOPLE
                .stream()
                // map
                .map(
                        (person) -> {
                            return person.getAge();
                        }
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals(20, ages.get(0));
        assertEquals(21, ages.get(19));
        assertEquals(20, ages.size());
    }

    @Test
    void mapPersonObjectsToAges() {
 /*
                    The syntax can get even crazier - but this is just a syntax sugar!
                    It's the same as in the first example, so use the extended (the most obvious version)
                    and then use IntelliJ to get to the most straightforward ( at the beginning, the craziest) syntax.
                 */

        List<Integer> ages = PEOPLE
                .stream()

                .map(Person::getAge)
                .toList();

        assertEquals(20, ages.get(0));
        assertEquals(21, ages.get(19));
        assertEquals(20, ages.size());
    }
/*
    Time for some practice:
     - map to List<Integers> (age)

 */

     @Test
    void mapPersonObjectsToLastName_comments() {
        List<String> lastNames = PEOPLE
                .stream()
                // map
                .map(
                        (person) -> {
                            return person.getLastName();
                        }
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals("Gunn", lastNames.get(0));
        assertEquals("Parrish", lastNames.get(19));
        assertEquals(20, lastNames.size());
    }

    @Test
    void mapPersonObjectsToLastName() {
 /*
                    The syntax can get even crazier - but this is just a syntax sugar!
                    It's the same as in the first example, so use the extended (the most obvious version)
                    and then use IntelliJ to get to the most straightforward ( at the beginning, the craziest) syntax.
                 */

    List<String> lastNames = PEOPLE
            .stream()

            .map(Person::getLastName)
            .toList();

        assertEquals("Gunn", lastNames.get(0));
        assertEquals("Parrish", lastNames.get(19));
        assertEquals(20, lastNames.size());
}



/*
     - map to List<String> (lastName)
     - map to List<Person.GENDER>

     extras: map List<Person> to List<PersonDTO>
 */

    @Test
    void mapPersonObjectsToGender_comments() {
        List<Person.Gender> genders = PEOPLE
                .stream()
                // map
                .map(
                        (person) -> {
                            return person.getGender();
                        }
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals(Person.Gender.MALE, genders.get(0));
        assertEquals(Person.Gender.FEMALE, genders.get(19));
        assertEquals(20, genders.size());
    }

    @Test
    void mapPersonObjectsToGender() {
 /*
                    The syntax can get even crazier - but this is just a syntax sugar!
                    It's the same as in the first example, so use the extended (the most obvious version)
                    and then use IntelliJ to get to the most straightforward ( at the beginning, the craziest) syntax.
                 */

        List<Person.Gender> genders = PEOPLE
                .stream()

                .map(Person::getGender)
                .toList();

        assertEquals(Person.Gender.MALE, genders.get(0));
        assertEquals(Person.Gender.FEMALE, genders.get(19));
        assertEquals(20, genders.size());
    }


    @Test
    void mapPersonObjectsToPersonDTO_comments() {
        List<PersonDTO> allPeopleDTO = PEOPLE
                .stream() // [person 1, person 2....] list
                // map
                .map( // person1 ->
                        (p) -> {
                            return new PersonDTO(p.getName(), p.getLastName());
                        }
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals(20, allPeopleDTO.size());
    }
}





