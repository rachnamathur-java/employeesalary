package car;

public class Electric extends Car {

    double length;
    double width;

    public Electric(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
