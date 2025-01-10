package car;

import java.util.Scanner;

public class CarService {
    Scanner scanner = new Scanner(System.in);

    Car diesel = new Diesel();
    Car electric = new Electric();
    Car gasoline = new Gasoline();



    public void getDetails(){

        Utils.choosecar();
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Diesel Car details...");
                System.out.println();
                diesel.printDetails("BMW", "SUV",53456.00);
                break;

            case 2:
                System.out.println("Electric Car details...");
                System.out.println();
                electric.printDetails("TOYOTA", "sedan", 52674.00);
                break;

            case 3:
                System.out.println("Gasoline Car details...");
                System.out.println();
                gasoline.printDetails("HONDA", "SUV", 56754.00);
                break;

        }

    }

}
