package UAP;

import java.util.*;

public class Case8Interface {
    public static void main(String[] args) {
        Case8Class item = new Case8Class();
        HashMap<String, Integer> hash;
        hash = new HashMap<>();

        do {
            item.printDomain();
            item.printMenu();

            switch (item.getChoose()) {
                case 1:
                    item.printDomain();
                    item.inputItem();
                    item.inputTotal();
                    hash.put(item.getItem(), item.getTotal());
                    item.printDomain();
                    item.printSuccessInput();
                    break;
                case 2:
                    if (hash.isEmpty()) {
                        item.printDomain();
                        item.printIsEmpty();
                    } else {
                        item.printDomain();
                        item.inputItem();

                        if (!hash.containsKey(item.getItem())) {
                            item.printDomain();
                            item.printInvalidItem();
                        } else {
                            hash.remove(item.getItem());
                            item.printDomain();
                            item.printSuccessDelete();
                        }
                    }
                    break;
                case 3:
                    if (hash.isEmpty()) {
                        item.printDomain();
                        item.printIsEmpty();
                    } else {
                        for (Map.Entry<String, Integer> a : hash.entrySet()) {
                            String itemName = a.getKey();
                            int totalItem = a.getValue();

                            item.printDomain();
                            System.out.println("Item : " + itemName);
                            System.out.println("Total : " + totalItem);
                        }
                    }
                    break;
                case 4:
                    item.printDomain();
                    item.printExit();
                    break;
                default:
                    item.printDomain();
                    item.printInvalid();
                    break;
            }
        } while (item.getChoose() != 4);
    }
}
