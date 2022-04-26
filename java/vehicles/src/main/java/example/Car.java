package example;

public class Car implements Vehicle {
    @Override
    public String startEngine() {
        String msg = "Copy string literal text to the clipboard";
        System.out.println(msg);
        return msg;
    }

    public boolean isTheLightOn() {
        System.out.println("The light is of");
        return false;
    }
}
