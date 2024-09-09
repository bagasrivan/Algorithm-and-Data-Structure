package UAP;

import java.util.*;

public class Case8Class {
    private String item;
    private int total, choose;
    Scanner input = new Scanner(System.in);

    public String getItem() {
        return item;
    }

    public int getTotal() {
        return total;
    }

    public int getChoose() {
        return choose;
    }

    void printMenu() {
        System.out.println(">>>>Welcome<<<<");
        System.out.println("1.Input item \n2.Delete item \n3.Print all item \n4.Exit");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void inputItem() {
        System.out.print("Input item : ");
        item = input.next();
    }

    void inputTotal() {
        System.out.print("Input total item : ");
        total = input.nextInt();
    }

    void printSuccessInput() {
        System.out.println("Successfully!! " + item + " was added to item list");
    }

    void printSuccessDelete() {
        System.out.println("Successfully!! " + item + " was deleted from item list");
    }

    void printIsEmpty() {
        System.out.println("Item list is empty");
    }

    void printInvalidItem() {
        System.out.println("Invalid, there is no item that named : " + item);
    }

    void printInvalid() {
        System.out.println("Invalid option, please  input valid option");
    }

    void printExit() {
        System.out.println("Thank you!!");
        System.exit(0);
    }

    void printDomain() {
        System.out.println("========");
    }
}
