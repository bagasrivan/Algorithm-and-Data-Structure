package Praktikum8;

import java.util.*;

public class Case8Interface {
    public static void main(String[] args) {
        Case8Class parking = new Case8Class();
        Scanner input = new Scanner(System.in);

        int choose = parking.getChoose();

        while (parking.getCheck() == true) {
            parking.printDomain();
            parking.printMenu();
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    parking.printDomain();
                    parking.printParking();
                    break;
                case 2:
                    if (parking.isEmpty()) {
                        parking.printDomain();
                        parking.printIsEmpty();
                    } else {
                        parking.printDomain();
                        parking.printPickup();
                    }
                    break;
                case 3:
                    if (parking.isEmpty()) {
                        parking.printDomain();
                        parking.printIsEmpty();
                    } else {
                        parking.printDomain();
                        parking.printParkingCond();
                    }
                    break;
                case 4:
                    parking.printDomain();
                    parking.printExit();
                    parking.printDomain();
                    break;
                default:
                    parking.printDomain();
                    parking.printInvalid();
                    break;
            }
        }
    }
}
