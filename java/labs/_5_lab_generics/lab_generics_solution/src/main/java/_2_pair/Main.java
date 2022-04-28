package _2_pair;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("key in pair 1", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "value in pair 2");
        Pair<String, String> pair3 = new Pair<>("key in pair 3", "value in pair 3");

        System.out.println("Key 1: " + pair1.getK());
        System.out.println("Key 2: " + pair2.getK());
        System.out.println("Key 3: " + pair3.getK());

        System.out.println("Value 1: " + pair1.getV());
        System.out.println("Value 2: " + pair2.getV());
        System.out.println("Value 3: " + pair3.getV());

    }

}