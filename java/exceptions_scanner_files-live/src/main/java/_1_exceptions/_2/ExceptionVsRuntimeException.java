package _1_exceptions._2;

public class ExceptionVsRuntimeException {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        go1();
    }

    private static void go1() {
        go2();
    }

    private static void go2() {
        go3();
    }

    private static void go3() {
//        Uncomment 1 at a time, fix, analyse
//        throw new Exception();
//        throw new RuntimeException();
    }
}
