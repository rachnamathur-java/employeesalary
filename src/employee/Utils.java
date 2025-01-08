package employee;

import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    //FullTimeEmp fullTimeEmp = new FullTimeEmp();

    public static void mainMenu() {

        System.out.println("******************");
        System.out.println("Welcome to Pragra");
        System.out.println("******************");
        System.out.println();
        System.out.println("Enter your Status...");
        System.out.println("Press 1 if you are a Full Time Employee...");
        System.out.println("Press 2 if you are a Part Time Employee...");
        System.out.println("Press 3 if you are a Contracting Employee...");
        System.out.println("Press 4 to exit...");
    }
}
