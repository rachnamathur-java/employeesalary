package employee;

import java.util.Scanner;

public class EmployeeService extends Employee {
    Utils utils = new Utils();

    Scanner scanner = new Scanner(System.in);

    public void employeeType() {
        Utils.mainMenu();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Full time Employee ");
                Employee fullTimeEmp = getEmp(1);
                fullTimeEmp.calculateSalary();
                break;
            case 2:
                System.out.println("Part time Employee");
                Employee partTimeEmp = getEmp(2);
                partTimeEmp.calculateSalary();
                break;
            case 3:
                System.out.println("Contracting Employee");
                Employee contractEmp = getEmp(3);
                contractEmp.calculateSalary();
                break;
            case 4:
                System.exit(0);
        }
    }


    private Employee getEmp(int empType) {
        System.out.println();
        System.out.println("Enter your details...");
        System.out.println();
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your Employee id..");
        int id = scanner.nextInt();
        System.out.println("Enter your Designation");
        String designation = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter number of Working Hours");
        double noOfHours = scanner.nextDouble();
        System.out.println();
        System.out.println("-----Employee Details-----");
        System.out.println();
        System.out.println("Employee Id  -->  " + id);
        System.out.println("Employee Name is  -->  " + name);
        System.out.println("Employee Age is  -->  " + age);
        System.out.println("Employee Designation is  -->  " + designation);
        System.out.println("Number of working hour is  -->  " + noOfHours);
        System.out.println();

        switch (empType) {
            case 1:
                return new FullTimeEmp(id, name, age, designation, noOfHours);
            case 2:
                return new PartTimeEmp(id, name, age, designation, noOfHours);
            case 3:
                return new ContractEmp(id, name, age, designation, noOfHours);

            default:
                System.out.println("Something went wrong!");
        }
        return new Employee();
    }
}
