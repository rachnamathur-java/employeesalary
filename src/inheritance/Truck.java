package inheritance;

public class Truck extends Vehicle{
    public Truck(int numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    @Override
    public void start() {
        System.out.println("truck start");
    }

    @Override
    public void brake() {
        System.out.println("truck brake");
    }

    @Override
    public void accelerate() {
        System.out.println("truck accelerate");
    }

    @Override
    public void printDetails() {
        System.out.println();
        System.out.println("truck details ");
        System.out.println("truck color "+color);
        System.out.println("no. of wheels "+numberOfWheels);
    }
}
