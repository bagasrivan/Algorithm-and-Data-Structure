package UAP;

import java.util.*;

public class Case2Class {
    private String product;
    private int total, choose;
    private boolean cond = true, found = false;
    Scanner input = new Scanner(System.in);

    public Case2Class(String product, int total) {
        this.product = product;
        this.total = total;
    }

    public String getProduct() {
        return product;
    }

    public int getTotal() {
        return total;
    }

    public boolean getCond() {
        return cond;
    }

    public int getChoose() {
        return choose;
    }

    public boolean getFound() {
        return found;
    }

    void printMenu() {
        System.out.println(">>>>Welcome<<<<");
        System.out.println("1.Insert product \n2.Delete product \n3.Show product \n4.Exit");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void inputProduct() {
        System.out.print("Input product name : ");
        product = input.next();
    }

    void inputTotal() {
        System.out.print("Input total product : ");
        total = input.nextInt();
    }

    void printSuccessInsert() {
        System.out.println("Successfully!! " + product + " was added to invent");
    }

    void printSuccessDelete() {
        System.out.println("Successfully!! " + product + " was deleted from invent");
    }

    void printConfirLoop() {
        System.out.println("1.Descending sort \n2.Ascending sort \n3.Back");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void printInvent() {
        System.out.println("All invent now : ");
    }

    void printIsEmpty() {
        System.out.println("Invent is empty");
    }

    void printInvalidProduct() {
        System.out.println("Invalid!! there is no product that named : " + product);
    }

    void printInvalid() {
        System.out.println("Invalid option, please input valid option");
    }

    void printBack() {
        System.out.println("Your will back to menu");
    }

    void printSortSuccess() {
        System.out.println("Sort success!!, please print your data again");
    }

    void printExit() {
        System.out.println("Thank you!!");
        System.exit(0);
    }

    void sortDescending(LinkedList<Case2Class> list) {
        int n = list.size();
        Case2Class[] arr = list.toArray(new Case2Class[0]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getTotal() < arr[j + 1].getTotal()) {
                    Case2Class temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        list.clear();
        list.addAll(Arrays.asList(arr));
    }

    void sortAscending(LinkedList<Case2Class> list) {
        int n = list.size();
        Case2Class[] arr = list.toArray(new Case2Class[0]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getTotal() > arr[j + 1].getTotal()) {
                    Case2Class temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        list.clear();
        list.addAll(Arrays.asList(arr));
    }

    void printDomain() {
        System.out.println("========");
    }
}
