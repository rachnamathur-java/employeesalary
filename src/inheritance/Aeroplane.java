package inheritance;

public class Aeroplane extends Vehicle{

    public Aeroplane(int numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    @Override
    public void start() {
        System.out.println("Plane starts");
    }

    @Override
    public void brake() {
        System.out.println("Plane brakes");
    }

    @Override
    public void printDetails() {
        System.out.println();
        System.out.println("aeroplane details");
        System.out.println("aeroplane color "+color);
        System.out.println("no. of wheels "+numberOfWheels);

    }

    @Override
    public void accelerate() {
        System.out.println("It can fly.... ");
    }

    public boolean canFlyInAir(){
        return true;
    }
}
