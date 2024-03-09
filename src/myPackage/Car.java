package myPackage;

public class Car extends Transport implements ILights {

    private boolean isOn = false;

    public Engine engine = new Engine();

    public Car() {

    }
    public Car (float speed, int weight, String color, byte[] coordinate) {

        super(speed, weight, color, coordinate);

    }

    @Override
    public void moveObject(Float speed) {
        System.out.println("Object speed is " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Blink");
    }
}
