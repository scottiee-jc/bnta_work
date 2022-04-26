package example;

public class Boat implements Vehicle {
    @Override
    public String startEngine() {
        String msg = "wroom wroom from Boat";
        System.out.println(msg);
        return msg;
    }

    public String raiseTheSail() {
        String msg = "The sail is up!";
        System.out.println(msg);
        return msg;
    }



}
