package employee;

public class ContractEmp extends Employee {

    double ratePerHourContracting;

    public ContractEmp(int id, String name, int age, String designation, double noOfHours) {
        super(id, name, age, designation, noOfHours);
        this.ratePerHourContracting = 40.89;
    }

    public void calculateSalary() {
        double salary = ratePerHourContracting * noOfHours;
        System.out.println("Total Salary of " + name + " ---> " + salary);
    }
}