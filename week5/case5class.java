package week5;

import java.util.*;

public class case5class {
    private String name;
    private double price;
    private int chooseMenu, chooseOrder, chooseLoop, chooseRemove, chooseDelete;
    Scanner input = new Scanner(System.in);

    public Case5Class(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getChooseMenu() {
        return chooseMenu;
    }

    public int getChooseOrder() {
        return chooseOrder;
    }

    public int getChooseLoop() {
        return chooseLoop;
    }

    public int getChooseRemove() {
        return chooseRemove;
    }

    public int getChooseDelete() {
        return chooseDelete;
    }

    void printInvalid() {
        System.out.println("Invaid choice!!");
    }

    void printDomain() {
        System.out.println("====");
    }

    void printSuccess() {
        System.out.println("Successfully add to cart!");
    }

    void printThankYou() {
        System.out.println("Thank You!!");
    }

    void printOutIndex() {
        System.out.println("Cannot delete, the item index invalid!");
    }

    void printSuccessDelete() {
        System.out.println("Deleted successfully!");
    }

    void exit() {
        System.exit(0);
    }

    void printLoop() {
        printDomain();
        System.out.println("Type 2 for back to menu");
        System.out.println("If you type except 2 you will order again");
        System.out.print("Your answer : ");
        chooseLoop = input.nextInt();
    }

    void printMainMenu() {
        printDomain();
        System.out.println(">>>>Welcome to Wekidi<<<<");
        System.out.println("1.Order \n2.Cart \n3.Exit");
        System.out.print("Your choice : ");
        chooseMenu = input.nextInt();
    }

    void printOrder() {
        printDomain();
        System.out.println(">>Today's Menu<<");
        System.out.println("1.Chicken Winglet : Rp.49.900");
        System.out.println("2.Chicken Strips : Rp.24.900");
        System.out.println("3.Chum Bucket : Rp.14.599");
        System.out.println("4.McBrian : Rp.99.900");
        System.out.print("Choose one : ");
        chooseOrder = input.nextInt();
    }

    void printConfirmRemove() {
        printDomain();
        System.out.println("Do you want to delete some product?");
        System.out.println("1.Yes \n2.No");
        System.out.print("Your choice : ");
        chooseRemove = input.nextInt();
    }

    void printRemove() {
        System.out.println("Choose the number index to delete");
        System.out.print("Your choice : ");
        chooseDelete = input.nextInt();
    }

    public double calculateTotalPrice(LinkedList<Case5Class> cart) {
        double totalPrice = 0.0;
        for (Case5Class product : cart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
