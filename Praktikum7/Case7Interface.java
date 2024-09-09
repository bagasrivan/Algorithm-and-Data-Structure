package Praktikum7;

import java.util.Stack;

public class Case7Interface {
    public static void main(String[] args) {
        Case7Class stack = new Case7Class(5);

        stack.push("Cola");
        stack.push("Sprite");
        stack.push("Tea");
        stack.push("Milk");
        stack.push("Coffee");

        do {
            stack.printMainMenu();
            switch (stack.getChooseMainMenu()) {
                case 1:
                    stack.printAwarness();
                    do {
                        stack.listDrink();
                        switch (stack.getChooseDrink()) {
                            case 1:
                                if (stack.isEmpty()) {
                                    stack.printDomain();
                                    stack.printIfEmpty();
                                } else {
                                    stack.printDomain();
                                    stack.printSuccess();
                                    System.out.println(stack.peek());
                                    stack.pop();
                                    stack.printDomain();
                                    System.out.println("List of drink left :");
                                }
                                break;
                            case 2:
                                if (stack.isEmpty()) {
                                    stack.printDomain();
                                    stack.printLastIfEmpty();
                                } else {
                                    stack.printDomain();
                                    System.out.println("The drink would be out : " + stack.peek());
                                }
                                break;
                            case 3:
                                stack.printDomain();
                                stack.printBack();
                                stack.printDomain();
                                break;
                            default:
                                stack.printDomain();
                                stack.printInvalid();
                                stack.printDomain();
                                break;
                        }
                    } while (stack.getChooseDrink() != 3);
                    break;
                case 2:
                    stack.printDomain();
                    stack.printThankYou();
                    stack.printDomain();
                    break;
                default:
                    stack.printDomain();
                    stack.printInvalid();
                    stack.printDomain();
                    break;
            }
        } while (stack.getChooseMainMenu() != 2);
    }
}
