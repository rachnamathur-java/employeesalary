package inheritance;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(int numberOfWheels, String color, int numberOfDoors) {
        super(numberOfWheels, color);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car starts ");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes...");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void printDetails() {
        System.out.println();
        System.out.println("Car details");
        System.out.println("car color "+color);
        System.out.println("no. of wheels "+4);
        System.out.println(("no. of doors "+4));

    }

    public boolean hasAC(){
        return true;
    }

}
