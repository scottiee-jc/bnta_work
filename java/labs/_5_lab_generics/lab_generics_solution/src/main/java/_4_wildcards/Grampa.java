package _4_wildcards;

public class Grampa {
    String name;

    public Grampa(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            /*
                this.getClass() is a special method in Java that allows us to, e.g. get an object's class
                and some info about it.
             */
        return "My name is " + name + ". I am a " + this.getClass().getSimpleName() + "!";
    }
}