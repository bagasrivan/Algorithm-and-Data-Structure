package Praktikum5;

import java.util.*;

public class Case5Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Case5Class> cart = new LinkedList<>();
        Case5Class wekidi = new Case5Class("null", 0);

        Case5Class menu1 = new Case5Class("Chicken Winglet", 49.900);
        Case5Class menu2 = new Case5Class("Chicken Strips", 24.900);
        Case5Class menu3 = new Case5Class("Chum Bucket", 14.599);
        Case5Class menu4 = new Case5Class("McBrian", 99.900);
        
        do {
            wekidi.printMainMenu();

            switch (wekidi.getChooseMenu()) {
                case 1:
                    do {
                        wekidi.printOrder();
                        switch (wekidi.getChooseOrder()) {
                            case 1:
                                cart.add(menu1);
                                wekidi.printDomain();
                                wekidi.printSuccess();
                                break;
                            case 2:
                                cart.add(menu2);
                                wekidi.printDomain();
                                wekidi.printSuccess();
                                break;
                            case 3:
                                cart.add(menu3);
                                wekidi.printDomain();
                                wekidi.printSuccess();
                                break;
                            case 4:
                                cart.add(menu4);
                                wekidi.printDomain();
                                wekidi.printSuccess();
                                break;
                            default:
                                wekidi.printDomain();
                                wekidi.printInvalid();
                                break;
                        }
                        wekidi.printLoop();
                        if (wekidi.getChooseLoop() == 2) {
                            wekidi.printDomain();
                            System.out.println("You will back to menu");
                        }
                    } while (wekidi.getChooseLoop() != 2);
                    break;
                case 2:
                    if (cart.isEmpty()) {
                        wekidi.printDomain();
                        System.out.println("Your cart is empty");
                    } else {
                        for (Case5Class product : cart) {
                            wekidi.printDomain();
                            System.out.println("Product : " + product.getName() + " Price : " + product.getPrice());
                        }
                        double total = wekidi.calculateTotalPrice(cart);
                        wekidi.printDomain();
                        System.out.println("Total Price : " + total);
                        do {
                            wekidi.printDomain();
                            wekidi.printConfirmRemove();
                            switch (wekidi.getChooseRemove()) {
                                case 1:
                                    wekidi.printRemove();
                                    int deleteIndex = wekidi.getChooseDelete();
                                    if (deleteIndex >= 0 && deleteIndex < cart.size()) {
                                        cart.remove(deleteIndex);
                                        wekidi.printSuccessDelete();
                                    } else {
                                        wekidi.printOutIndex();
                                    }
                                    break;
                                case 2:
                                    System.out.println(" ");
                                    break;
                                default:
                                    wekidi.printInvalid();
                                    break;
                            }
                        } while (wekidi.getChooseRemove() != 2);
                    }
                    break;
                case 3:
                    wekidi.printThankYou();
                    wekidi.exit();
                    break;
                default:
                    wekidi.printDomain();
                    wekidi.printInvalid();
                    break;
            }
        } while (wekidi.getChooseMenu() != 3);
    }
}
