package UTP;

import java.util.*;

public class UTPClass {
    Scanner input = new Scanner(System.in);
    private int chooseLogin, chooseLoop, chooseList, chooseSort, chooseAscDsc;
    int dataCount = 0;
    String arrName[] = new String[9999999];
    String arrNIM[] = new String[9999999];
    double arrIPS[] = new double[9999999];
    int arrSKS[] = new int[9999999];

    public int getDataCount() {
        return dataCount;
    }

    public int getChooseAscDsc() {
        return chooseAscDsc;
    }

    public int getChooseSort() {
        return chooseSort;
    }

    public int getChooseLogin() {
        return chooseLogin;
    }

    public int getChooseLoop() {
        return chooseLoop;
    }

    public int getChooseList() {
        return chooseList;
    }

    void exit() {
        System.exit(0);
    }

    void printInvalid() {
        System.out.println("Invalid choice!!");
    }

    void printMenu() {
        printDomain();
        System.out.println(">>Welcome to Simabi<<");
        System.out.println("1.Input Data \n2.Data List \n3.Exit");
        System.out.print("Your choice : ");
        chooseLogin = input.nextInt();
    }

    void printThankYou() {
        System.out.println("Thank you!!");
    }

    void printDomain() {
        System.out.println("====");
    }

    void inputData() {
        System.out.print("Input name : ");
        arrName[dataCount] = input.next();
        System.out.print("Input NIM : ");
        arrNIM[dataCount] = input.next();
        System.out.println("IPS range is from 0 to 4, if the value out of range the SKS would be 0");
        System.out.print("Input IPS : ");
        arrIPS[dataCount] = input.nextDouble();
        arrSKS[dataCount] = totalSKS(arrIPS[dataCount]);
        dataCount++;
        System.out.println("Your max SKS for next semester : " + arrSKS[dataCount - 1]);
    }

    void dataList() {
        printDomain();
        System.out.println(">>Data list menu<<");
        System.out.println("1.Print all data \n2.Seacrh data \n3.Back");
        System.out.print("Your choice : ");
        chooseList = input.nextInt();

        switch (chooseList) {
            case 1:
                if (dataCount == 0) {
                    System.out.println("You're not inputed any data yet");
                } else {
                    printData();
                    printSort();
                }
                break;
            case 2:
                if (dataCount == 0) {
                    System.out.println("You're not inputed any data yet");
                } else {
                    sequentialSearch();
                }
                break;
            case 3:
                System.out.println("You will back to menu");
                break;
            default:
                printInvalid();
                break;
        }
    }

    void printData() {
        printDomain();
        System.out.println("All data : ");
        for (int i = 0; i < dataCount; i++) {
            System.out.println("Name : " + arrName[i]);
            System.out.println("NIM : " + arrNIM[i]);
            System.out.println("IPS : " + arrIPS[i]);
            System.out.println("Total next semester SKS : " + arrSKS[i]);
            System.out.println();
        }
    }

    void printSort() {
        printDomain();
        System.out.println("Do you want to sort the data?");
        System.out.println("1.Yes \n2.No");
        System.out.print("Your choice : ");
        chooseSort = input.nextInt();

        if (chooseSort == 1) {
            printDomain();
            System.out.println("1.Ascending Sort \n2.Descending Sort");
            System.out.print("Your choice : ");
            chooseAscDsc = input.nextInt();

            switch (chooseAscDsc) {
                case 1:
                    quickSortAscending();
                    break;
                case 2:
                    bubbleSortDsc();
                    break;
                default:
                    printInvalid();
                    break;
            }
        } else if (chooseSort == 2) {
            System.out.println("You will back to data list menu");
        } else {
            printInvalid();
            System.out.println("You will back to data list menu");
        }
    }

    public int totalSKS(double arrIPS) {
        if (arrIPS >= 3.51 && arrIPS <= 4) {
            return 24;
        } else if (arrIPS >= 2.51 && arrIPS <= 3.5) {
            return 22;
        } else if (arrIPS >= 2 && arrIPS <= 2.5) {
            return 20;
        } else if (arrIPS >= 1.5 && arrIPS <= 1.99) {
            return 16;
        } else if (arrIPS >= 0 && arrIPS <= 1.49) {
            return 14;
        } else if (arrIPS < 0 && arrIPS > 4) {
            return 0;
        } else {
            return 0;
        }
    }

    void sequentialSearch() {
        System.out.print("Enter NIM to search : ");
        String searchNIM = input.next();
        int foundIndex = -1;

        for (int i = 0; i < dataCount; i++) {
            if (arrNIM[i].equals(searchNIM)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Data found:");
            System.out.println("Name: " + arrName[foundIndex]);
            System.out.println("NIM: " + arrNIM[foundIndex]);
            System.out.println("IPS: " + arrIPS[foundIndex]);
            System.out.println("Total SKS: " + arrSKS[foundIndex]);
        } else {
            System.out.println("Data not found");
        }
    }

    void bubbleSortDsc() {
        for (int i = 0; i < dataCount - 1; i++) {
            for (int j = 0; j < dataCount - i - 1; j++) {
                if (arrIPS[j] < arrIPS[j + 1]) {
                    String tempName = arrName[j];
                    String tempNIM = arrNIM[j];
                    double tempIPS = arrIPS[j];
                    int tempSKS = arrSKS[j];

                    arrName[j] = arrName[j + 1];
                    arrNIM[j] = arrNIM[j + 1];
                    arrIPS[j] = arrIPS[j + 1];
                    arrSKS[j] = arrSKS[j + 1];

                    arrName[j + 1] = tempName;
                    arrNIM[j + 1] = tempNIM;
                    arrIPS[j + 1] = tempIPS;
                    arrSKS[j + 1] = tempSKS;
                }
            }
        }
        System.out.println("Data has been sorted in Descending order based on IPS");
        System.out.println("Please print data for check the result!");
    }

    void quickSortAsc(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSortAsc(low, pivotIndex - 1);
            quickSortAsc(pivotIndex + 1, high);
        }
    }

    int partition(int low, int high) {
        double pivot = arrIPS[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arrIPS[j] < pivot) {
                i++;

                String tempName = arrName[i];
                String tempNIM = arrNIM[i];
                double tempIPS = arrIPS[i];
                int tempSKS = arrSKS[i];

                arrName[i] = arrName[j];
                arrNIM[i] = arrNIM[j];
                arrIPS[i] = arrIPS[j];
                arrSKS[i] = arrSKS[j];

                arrName[j] = tempName;
                arrNIM[j] = tempNIM;
                arrIPS[j] = tempIPS;
                arrSKS[j] = tempSKS;
            }
        }

        String tempName = arrName[i + 1];
        String tempNIM = arrNIM[i + 1];
        double tempIPS = arrIPS[i + 1];
        int tempSKS = arrSKS[i + 1];

        arrName[i + 1] = arrName[high];
        arrNIM[i + 1] = arrNIM[high];
        arrIPS[i + 1] = arrIPS[high];
        arrSKS[i + 1] = arrSKS[high];

        arrName[high] = tempName;
        arrNIM[high] = tempNIM;
        arrIPS[high] = tempIPS;
        arrSKS[high] = tempSKS;

        return i + 1;
    }

    void quickSortAscending() {
        quickSortAsc(0, dataCount - 1);
        System.out.println("Data has been sorted in Ascending order based on IPS");
        System.out.println("Please print data for check the result!");
    }
}
