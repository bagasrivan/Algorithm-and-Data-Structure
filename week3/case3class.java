package week3;

import java.util.Scanner;

public class case3class {
    Scanner inputArr = new Scanner(System.in);
    private int n, find, loop;
    int[] arr;

    public int getN() {
        return n;
    }

    public int getLoop() {
        return loop;
    }

    void printSizeArr() {
        System.out.println("Welcome");
        System.out.print("Please input size of Array : ");
        n = inputArr.nextInt();
    }

    void inputArray() {
        arr = new int[n];
    }

    void printValueArr() {
        for (int i = 0; i < n; i++) {
            System.out.print("Please input value Array number-" + i + " : ");
            arr[i] = inputArr.nextInt();
        }
    }

    void printArr() {
        int n = arr.length;
        System.out.print("Array value : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void bubbleSortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortDsc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void findIndexValue() {
        System.out.print("Input the value that you want to find : ");
        find = inputArr.nextInt();
        int index = -1;
        boolean finding = false;
        for (int i = 0; i < n; i++) {
            if (find == arr[i]) {
                index = i;
                finding = true;
            }
        }
        if (finding == true) {
            System.out.println("Value " + find + " finded in index number " + index);
        } else {
            System.out.println("The value " + find + " not found in Array!");
        }
    }

    void printMenu() {
        System.out.println("====");
        System.out.println(">>Program Menu<<");
        System.out.println("1. Sort Ascending \n2. Sort Descending \n3. Find Value and Index \n0. Exit");
        System.out.print("Your choose : ");
        loop = inputArr.nextInt();
    }
}
