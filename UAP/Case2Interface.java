package UAP;

import java.util.*;

public class Case2Interface {
    public static void main(String[] args) {
        LinkedList<Case2Class> linked = new LinkedList<>();
        Case2Class invent = new Case2Class(null, 0);

        while (invent.getCond() == true) {
            invent.printDomain();
            invent.printMenu();

            switch (invent.getChoose()) {
                case 1:
                    invent.printDomain();
                    invent.inputProduct();
                    invent.inputTotal();
                    Case2Class insert = new Case2Class(invent.getProduct(), invent.getTotal());
                    linked.add(insert);
                    invent.printDomain();
                    invent.printSuccessInsert();
                    break;
                case 2:
                    if (linked.isEmpty()) {
                        invent.printDomain();
                        invent.printIsEmpty();
                    } else {
                        invent.printDomain();
                        invent.inputProduct();

                        Iterator<Case2Class> iterator = linked.iterator();
                        boolean found = invent.getFound();
                        while (iterator.hasNext()) {
                            Case2Class product = iterator.next();
                            if (product.getProduct().equals(invent.getProduct())) {
                                iterator.remove();
                                invent.printDomain();
                                invent.printSuccessDelete();
                                found = true;
                                break;
                            }

                            if (!found) {
                                invent.printDomain();
                                invent.printInvalidProduct();
                            }
                        }
                    }
                    break;
                case 3:
                    if (linked.isEmpty()) {
                        invent.printDomain();
                        invent.printIsEmpty();
                    } else {
                        invent.printDomain();
                        invent.printInvent();
                        for (int i = 0; i < linked.size(); i++) {

                            invent.printDomain();
                            System.out.println("Product : " + linked.get(i).getProduct());
                            System.out.println("Total : " + linked.get(i).getTotal());
                        }

                        do {
                            invent.printDomain();
                            invent.printConfirLoop();

                            switch (invent.getChoose()) {
                                case 1:
                                    invent.printDomain();
                                    invent.sortDescending(linked);
                                    invent.printSortSuccess();
                                    break;
                                case 2:
                                    invent.printDomain();
                                    invent.sortAscending(linked);
                                    invent.printSortSuccess();
                                    break;
                                case 3:
                                    invent.printDomain();
                                    invent.printBack();
                                    break;
                                default:
                                    invent.printDomain();
                                    invent.printInvalid();
                                    break;
                            }
                        } while (invent.getChoose() != 3);
                    }
                    break;
                case 4:
                    invent.printDomain();
                    invent.printExit();
                    break;
                default:
                    invent.printDomain();
                    invent.printInvalid();
                    break;
            }
        }
    }
}
