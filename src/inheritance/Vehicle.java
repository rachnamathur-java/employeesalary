package inheritance;

public class Vehicle {
    int numberOfWheels;
    String color;

    public Vehicle(int numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public void start(){
        System.out.println("Vehicle starts");
    }

    public void brake(){
        System.out.println("Vehcile brakes");
    }

    public void accelerate(){
        System.out.println("vehcile can accelerate");
    }

    public void printDetails(){
        System.out.println("vehicle details ");
        System.out.println("Number of doors...");
        System.out.println("color");



    }
}
