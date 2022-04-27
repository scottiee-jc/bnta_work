package org.example._8_accessors_and_packages;

public class Service {

    /*
        Access modifiers:
        private, (default), protected, public
     */
    private String privateMethod() {
        return "private = visible only inside this class";
    }

    String defaultAccessModifierMethod() {
        return "No access modifier = default = package private";
    }

    // We'll explain that when we'll talk about the inheritance
    protected String protectedMethod() {
        return "protected = package private+ ";
    }

    public String publicMethod() {
        return "public = visible everywhere";
    }

}
