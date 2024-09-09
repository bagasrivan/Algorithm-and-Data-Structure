package UAP;

import java.util.*;

public class Case6Interface {
    public static void main(String[] args) {
        Stack<Case6Class> toDo;
        toDo = new Stack<>();
        Case6Class stack = new Case6Class(null, null);

        do {
            stack.printDomain();
            stack.printMenu();

            switch (stack.getChoose()) {
                case 1:
                    stack.printDomain();
                    stack.printInputTitle();
                    stack.printInputDesc();
                    Case6Class inputStack = new Case6Class(stack.getTitle(), stack.getDescription());
                    toDo.push(inputStack);
                    stack.printDomain();
                    stack.printSuccess();
                    break;
                case 2:
                    if (toDo.isEmpty()) {
                        stack.printDomain();
                        stack.printIsEmpty();
                    } else {
                        stack.printDomain();
                        stack.printTopStack();
                        System.out.println(toDo.peek().getTitle());
                        stack.printDomain();
                        stack.confirDelete();
                        switch (stack.getChoose()) {
                            case 1:
                                toDo.pop();
                                stack.printDomain();
                                stack.printSuccess();
                                break;
                            case 2:
                                stack.printDomain();
                                stack.backMenu();
                                break;
                            default:
                                stack.printDomain();
                                stack.printInvalid();
                                break;
                        }
                    }
                    break;
                case 3:
                    stack.printDomain();
                    stack.printStack();
                    for (int i = 0; i < toDo.size(); i++) {
                        System.out.println("Title : " + toDo.get(i).getTitle());
                        System.out.println("Description : " + toDo.get(i).getDescription());
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
        } while (stack.getChoose() != 4);
    }
}
