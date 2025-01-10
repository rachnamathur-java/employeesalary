package car;

public class Diesel extends Car {

    public Diesel(String brand, String model, double price) {
        super(brand, model, price);
    }

    public Diesel() {
    }

    @Override
    public void printDetails(String brand, String model, double price) {
        super.printDetails(brand, model, price);
    }
}
