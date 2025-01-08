package inheritance;

import inheritance.Aeroplane;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(4,"white");
        Car car = new Car(4,"black",4);
        MotorBike motorBike = new MotorBike(2,"black",5);
        Aeroplane aeroplane = new Aeroplane(6,"silver");
        Truck truck = new Truck(8,"brown");

        System.out.println();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.start();
        vehicle.printDetails();

        System.out.println();
        car.accelerate();
        car.brake();
        car.start();
        car.hasAC();
        car.printDetails();

        System.out.println();
        motorBike.brake();
        motorBike.start();
        motorBike.accelerate();
        motorBike.canDoWheele();
        motorBike.printDetails();

        System.out.println();
        aeroplane.brake();
        aeroplane.start();
        aeroplane.accelerate();
        aeroplane.canFlyInAir();
        aeroplane.printDetails();

        System.out.println();
        truck.brake();
        truck.start();
        truck.accelerate();
        truck.printDetails();

        System.out.println(car.getClass().getSuperclass().getName());



        // create object of all the classes
        // Bike, car, Aeroplane
        // and call the respective methods for all of them
        // provide values of specific data memebers

        // add another class called Truck



    }
}
