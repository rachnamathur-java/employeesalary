package employee;

public class FullTimeEmp extends Employee {

    double fullTimeSalary;

    public FullTimeEmp(int id, String name, int age, String designation, double noOfHours) {
        super(id, name, age, designation, noOfHours);
        this.fullTimeSalary = 60000;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total salary of Employee -->  " + fullTimeSalary);
    }
}
