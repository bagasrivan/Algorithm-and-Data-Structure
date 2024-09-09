package Praktikum3;

import java.util.*;

public class Case3Interface {
    public static void main(String[] args) {
        Case3Class sorting = new Case3Class();

        sorting.printSizeArr();
        if (sorting.getN() == 0) {
            System.out.println("The size of Array cannot be 0, please rerun");
        } else if (sorting.getN() < 0) {
            System.out.println("The size of Array cannot be Negative, please rerun");
        } else {
            sorting.inputArray();
            sorting.printValueArr();
            sorting.printArr();

            do {
                sorting.printMenu();

                switch (sorting.getLoop()) {
                    case 1:
                        sorting.bubbleSortAsc(sorting.arr);
                        sorting.printArr();
                        break;
                    case 2:
                        sorting.bubbleSortDsc(sorting.arr);
                        sorting.printArr();
                        break;
                    case 3:
                        sorting.findIndexValue();
                        break;
                    case 0:
                        System.out.println("Thank you for using this program");
                        break;
                    default:
                        System.out.println("Invalid choice!! Please choose 1, 2, 3 or 0");
                }
            } while (sorting.getLoop() != 0);
        }
    }
}
