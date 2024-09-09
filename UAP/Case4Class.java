package UAP;

import java.util.*;

public class Case4Class {
    Scanner input = new Scanner(System.in);
    private int maxElement = 6, choose;
    boolean cond = true;

    public int getChoose() {
        return choose;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public boolean getCond() {
        return cond;
    }

    void printNext() {
        System.out.println(">>Welcome<<");
        System.out.println("Go to next step?");
        System.out.println("1.Yes \n2.No");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void printQueue() {
        System.out.print("Queue : ");
    }

    void addFourElement() {
        System.out.println("Successfully add 4 element to queue");
    }

    void deleteElement() {
        System.out.println("Successfully delete element from queue");
    }

    void addElement() {
        System.out.println("Successfully add element to queue");
    }

    void printExit() {
        System.out.println("Program exit, thank you");
        exit();
    }

    void printIsFull() {
        System.out.println("Sorry, element is full");
    }

    void exit() {
        System.exit(0);
    }

    void printInvalid() {
        System.out.println("Invalid option, please input the valid option");
    }

    void printDomain() {
        System.out.println("========");
    }
}
