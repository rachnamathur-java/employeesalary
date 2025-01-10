package car;

public class Car {
   String brand;
   String model;
   double price;

    public Car() {
    }

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printDetails(String brand, String model, double price){
       System.out.println("Brand Name  -->  "+brand);
       System.out.println("Model  -->  "+model);
       System.out.println("Price  -->  "+price);
   }

}
