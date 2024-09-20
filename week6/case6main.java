package week6;

import java.util.*;

public class case6main {
    public static void main(String[] args) {
        case6class groceries = new case6class();
        Queue<String> queue = new LinkedList<>();

        do {
            groceries.printMainMenu();
            switch (groceries.getChooseMainMenu()) {
                case 1:
                    queue.add("Balya");
                    queue.add("Jaki");
                    queue.add("Bagas");
                    queue.add("Kafilah");
                    queue.add("Riston");
                    groceries.printDomain();
                    groceries.printWelcome();
                    groceries.printStock();
                    System.out.println("Queue : " + queue);
                    do {
                        groceries.printMenuGroceries();
                        switch (groceries.getChooseGroceries()) {
                            case 1:
                                if (groceries.getStock() > -1) {
                                    groceries.printDomain();
                                    System.out.print("[" + queue.peek() + "]");
                                    System.out.println(" Got the groceries");
                                    groceries.printStock();
                                    queue.poll();
                                    System.out.println("Queue : " + queue);
                                } else {
                                    groceries.printDomain();
                                    groceries.printOutOfStock();
                                    System.out.println("Queue : " + queue);
                                }
                                break;
                            case 2:
                                groceries.printDomain();
                                groceries.printClose();
                                groceries.printExit();
                                break;
                            default:
                                groceries.printDomain();
                                groceries.printInvalid();
                                break;
                        }
                    } while (groceries.getChooseGroceries() != 2);
                    break;
                case 2:
                    groceries.printDomain();
                    groceries.printExit();
                    break;
                default:
                    groceries.printDomain();
                    groceries.printInvalid();
                    break;
            }
        } while (groceries.getChooseMainMenu() != 2);
    }
}
