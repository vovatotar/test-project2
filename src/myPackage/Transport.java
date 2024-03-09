package myPackage;

public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport() {

    }

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created ");
        setValues(speed, weight, color, coordinate);
        //System.out.println(getValues());
    }

    public Transport (int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(getValues());
    }

    public abstract void moveObject(Float speed);
    public abstract boolean stopObject();

    public void setValues (float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";
        String infoCoordinates = "Coordinates:\n";

        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void isReady(boolean isReady){
             this.isReady = isReady;
        }


        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void info() {
           if(isReady)
               System.out.println("Engine good");
           else
               System.out.println("Engine not good " + km + " km");
        }
    }
}
