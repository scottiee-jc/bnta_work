package org.example._1_class_multiple_meanings;

public class Main {

    public static void main(String[] args) {

    }
}


/*
    TODO 1a: class can have many meanings, depending on the context. Read the below descriptions.
    Let's start with a definition of a class in our textbook.


    A class defines a type of object - you can think of it as a blueprint.
    You could create multiple dog objects from a Dog class, multiple cat objects from a Cat class, etc.
    Classes are composed of two essential elements:
    Characteristics that properties define, and behaviours which are defined by methods.

    This is a good, precise definition. To let it sink in your brain - requires some time and some practice,
    for now, try to memorize it.

    When you hear a fellow developer talking about a class, she may speak of different things.

    1st it's a definition similar to the one from our textbook.

    2nd it's a file with a .java extension, e.g., Main.java

    3rd it's a piece of code in a file, e.g., public class Main {}

    4th it's a compiled .java file, e.g., Main.class

    5th it's a compiled file, e.g., Main.class loaded into JVM memory.

    That's a lot! And it's so easy to be confused.

    TODO 1b: Your task is to find and see all the above examples.

    1. Find the definition in the textbook
    2. Find Main.java in the filesystem (package org.example._1_class_multiple_meanings)
    3. Locate public class Main {} in Main.java
    4. Run the program (Main) - under the hood, IntelliJ will use Maven - the compiled class(es) will be located
    in the target directory of your project. Find Main.class in the filesystem (it will show up only after you run
    the program - to run the program, the source files (.java extension) must be compiled first).
    5. We can 'see' the classes loaded to JVM by listing them. To do so, you need to add a particular option
    to IntelliJ's running-config

    Edit Configuration -> Modify Options -> Check 'Add VM Options' -> in the appeared text box write: -verbose

    Run the program and
    - find Main.class in the logs,
    - what is the class' full name?
    - from what place in the filesystem is the class loaded?
 */