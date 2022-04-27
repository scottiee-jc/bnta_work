package _1_box;

public class Main {
    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box();
        boxWithoutRestrictions.set("");
        boxWithoutRestrictions.set(1);
        boxWithoutRestrictions.set(false);

        Box<Integer> boxForIntegersOnly = new Box();
//        compiler error
//        boxForIntegersOnly.set("");
        boxForIntegersOnly.set(1);
//        compiler error
//        boxForIntegersOnly.set(false);
    }
}
