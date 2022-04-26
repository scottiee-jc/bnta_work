package example;

public class Plane implements Vehicle {
    @Override
    public String startEngine() {
        String msg = "wroom wroom from plane";
        System.out.println(msg);
        return msg;
    }

    public void deployLandingGear() {
        String msg = "Landing gear deployed!";
        System.out.println(msg);
    }
}
