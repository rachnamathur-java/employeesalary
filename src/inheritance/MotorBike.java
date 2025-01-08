package inheritance;

public class MotorBike extends Vehicle{
    int numberOfKicks;

    public MotorBike(int numberOfWheels, String color, int numberOfKicks) {
        super(numberOfWheels, color);
        this.numberOfKicks = numberOfKicks;
    }

    @Override
    public void start() {
        System.out.println("Bike starts ");
    }

    @Override
    public void brake() {
        System.out.println("bike brakes ");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerate ");
    }

    @Override
    public void printDetails() {
        System.out.println();
        System.out.println("MotorBike details...");
        System.out.println("bike color "+color);
        System.out.println("no. of wheels "+numberOfWheels);
        System.out.println(("no. of kicks "+numberOfKicks));
    }

    public boolean canDoWheele(){
        return true;
    }
}
