package employee;

public class PartTimeEmp extends Employee {

    double ratePerHourPart;

    public PartTimeEmp(int id, String name, int age, String designation, double noOfHours) {
        super(id, name, age, designation, noOfHours);
        this.ratePerHourPart = 27.46;
    }

    public void calculateSalary() {
        double salary = ratePerHourPart * noOfHours;
        System.out.println("Total Salary of ---> " + salary);

    }
}
