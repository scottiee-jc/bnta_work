package _1_exceptions._3;

public class ExceptionsAndInheritance {
    /*
        Experiment with deleting the throws declarations in Parent / Kid
     */
}


class Parent {
    void goE() throws Exception {
        throw new Exception();
    }

    void goRE() throws RuntimeException {
        throw new RuntimeException();
    }
}

class Kid extends Parent {
    @Override
    void goE() throws Exception {
        super.goE();
    }

    @Override
    void goRE() throws RuntimeException {
        super.goRE();
    }
}

