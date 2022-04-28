package org.example._8_accessors_and_packages;

import org.example._8_accessors_and_packages.Service;

/*
    TODO 1 readme
    In the Service class, there are 4 methods defined with different access modifiers.
    The Client class uses those methods. Depending on the access modifier, and how both
    classes are located in the packages, the methods will be accessible or not.

    Since Client and Service are located in the same class, default, protected, and public methods
    are accessible. privateMethod() is visible only inside the class it's implemented.

    TODO 2
    Move the Client class to org.example._8_client_service_and_packages.subpackage and
    observe the compiler errors - IntelliJ will mark non-accessible methods.
 */
public class Client {

    public static void main(String[] args) {
        Service service = new Service();

//        service.privateMethod(); <- IntelliJ won't even show that method
        service.defaultAccessModifierMethod();
        service.protectedMethod();
        service.publicMethod();
    }
}
