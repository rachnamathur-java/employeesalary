package employee;

public class Employee {

    int id;
    String name;
    int age;
    String designation;
    double noOfHours;

    public Employee(int id, String name, int age, String designation, double noOfHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.noOfHours = noOfHours;
    }

    public Employee() {
    }

    public void calculateSalary() {
        System.out.println("salary");
    }

    public void showDetails() {
        System.out.println("details...");
    }
}