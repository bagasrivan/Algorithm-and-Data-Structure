package Praktikum4;

import java.util.*;

public class Case4Class {

    Scanner input = new Scanner(System.in);
    private int size, choose;
    String[] arr;

    public int getSize() {
        return size;
    }

    public int getChoose() {
        return choose;
    }

    void inputArr() {
        arr = new String[size];
    }

    void printMenu() {
        System.out.println(">>>>Welcome to Quick Sort Program<<<<");
        System.out.print("Please input your data size (minimum 10 data) : ");
        size = input.nextInt();
    }

    void printDisable() {
        System.out.println("Sorry, 10 data requirement for using this program");
        System.out.println("Please input 10 data!!!!");
    }

    void printValueArr() {
        inputArr();
        for (int i = 0; i < size; i++) {
            System.out.print("Please input value Array number-" + i + " : ");
            arr[i] = input.next();
        }
    }

    void printArrBefore() {
        int size = arr.length;
        System.out.print("Array before sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void printArrAfter() {
        int size = arr.length;
        System.out.print("Array after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void printDomain() {
        System.out.println("=====");
    }

    void printLoop() {
        printDomain();
        System.out.println("Do you want to rerun program?");
        System.out.print("1.Yes \n2.No \nYour choose : ");
        choose = input.nextInt();
    }

    int partition(String[] arr, int left, int right) {
        String pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    void quicksort(String[] arr, int left, int right) {
        if (left < right) {
            int pivotInd = partition(arr, left, right);

            quicksort(arr, left, pivotInd - 1);
            quicksort(arr, pivotInd + 1, right);
        }
    }
}
