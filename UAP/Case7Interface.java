package UAP;

import java.util.*;

public class Case7Interface {
    public static void main(String[] args) {
        Case7Class stack = new Case7Class();
        HashMap<String, Object> hash;
        hash = new HashMap<>();

        while (stack.getCheck() == true) {
            stack.printDomain();
            stack.printMenu();

            switch (stack.getChoose()) {
                case 1:
                    stack.printDomain();
                    stack.inputTitle();
                    stack.inputDesc();
                    hash.put(stack.getTitle(), stack.getDesc());
                    stack.printDomain();
                    stack.printSuccessInput();
                    break;
                case 2:
                    if (hash.isEmpty()) {
                        stack.printDomain();
                        stack.printIsEmpty();
                    } else {
                        stack.printDomain();
                        stack.inputTitle();

                        if (!hash.containsKey(stack.getTitle())) {
                            stack.printDomain();
                            stack.invalidTitle();
                        } else {
                            hash.remove(stack.getTitle());
                            stack.printDomain();
                            stack.printSuccessDelete();
                        }
                    }
                    break;
                case 3:
                    if (hash.isEmpty()) {
                        stack.printDomain();
                        stack.printIsEmpty();
                    } else {
                        for (Map.Entry<String, Object> a : hash.entrySet()) {
                            String title = a.getKey();
                            Object desc = a.getValue();

                            stack.printDomain();
                            System.out.println("Title : " + title);
                            System.out.println("Description : " + desc);
                        }
                    }
                    break;
                case 4:
                    stack.printDomain();
                    stack.printExit();
                    break;
                default:
                    stack.printDomain();
                    stack.printInvalid();
                    break;
            }
        }
    }
}
