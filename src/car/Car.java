package car;

public class Car {
   String brand;
   String model;
   double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printDetails(String brand, String model, double price){
       System.out.println(brand);
       System.out.println(model);
       System.out.println(price);
   }

}
