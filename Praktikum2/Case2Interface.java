package Praktikum2;

import java.util.*;

public class Case2Interface {
    public static void main(String[] args) {
        Case2Class factorial = new Case2Class();

        factorial.printMenu();

        if (factorial.getN() == 0) {
            factorial.printNol();
        } else if (factorial.getN() < 0) {
            factorial.printNegative();
        } else {
            factorial.printRecursive();
            int printFactor = factorial.factorialOpr(factorial.getN());
            System.out.print("" + printFactor);
        }

        do {
            factorial.printConfirmLoop();
            if (factorial.getChoose() == 1) {
                factorial.printMenu();

                if (factorial.getN() == 0) {
                    factorial.printNol();
                } else if (factorial.getN() < 0) {
                    factorial.printNegative();
                } else {
                    factorial.printRecursive();
                    int printFactor = factorial.factorialOpr(factorial.getN());
                    System.out.print("" + printFactor);
                }
            } else if (factorial.getChoose() == 2) {
                System.out.println("Thank you for used this program");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        } while (factorial.getChoose() != 2);
    }
}
