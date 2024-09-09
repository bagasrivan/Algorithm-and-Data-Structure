package UAP;

import java.util.*;

public class Case4Interface {
    public static void main(String[] args) {
        Case4Class element = new Case4Class();
        Queue<Integer> queue = new LinkedList<>();

        while (element.getCond()) {
            element.printDomain();
            element.printNext();
            switch (element.getChoose()) {
                case 1:
                    for (int i = 701; i < 705; i++) {
                        queue.add(i);
                    }
                    element.printDomain();
                    element.addFourElement();
                    element.printQueue();
                    System.out.println(queue);

                    while (element.getCond()) {
                        element.printDomain();
                        element.printNext();
                        switch (element.getChoose()) {
                            case 1:
                                element.printDomain();
                                element.deleteElement();
                                System.out.println("[" + queue.poll() + "] was removed from element");
                                element.printQueue();
                                System.out.println(queue);

                                while (element.getCond()) {
                                    element.printDomain();
                                    element.printNext();
                                    switch (element.getChoose()) {
                                        case 1:
                                            if (queue.size() < element.getMaxElement()) {
                                                element.printDomain();
                                                element.addElement();
                                                queue.add(705);
                                                element.printQueue();
                                                System.out.println(queue);
                                            } else {
                                                element.printDomain();
                                                element.printIsFull();
                                            }

                                            while (element.getCond()) {
                                                element.printDomain();
                                                element.printNext();
                                                switch (element.getChoose()) {
                                                    case 1:
                                                        if (queue.size() < element.getMaxElement()) {
                                                            element.printDomain();
                                                            element.addElement();
                                                            queue.add(706);
                                                            element.printQueue();
                                                            System.out.println(queue);
                                                            element.printDomain();
                                                            element.printExit();
                                                        } else {
                                                            element.printDomain();
                                                            element.printIsFull();
                                                        }
                                                        break;
                                                    case 2:
                                                        element.printDomain();
                                                        element.printExit();
                                                        break;
                                                    default:
                                                        element.printDomain();
                                                        element.printInvalid();
                                                        break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            element.printDomain();
                                            element.printExit();
                                            break;
                                        default:
                                            element.printDomain();
                                            element.printInvalid();
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                element.printDomain();
                                element.printExit();
                                break;
                            default:
                                element.printDomain();
                                element.printInvalid();
                                break;
                        }
                    }
                    break;
                case 2:
                    element.printDomain();
                    element.printExit();
                    break;
                default:
                    element.printDomain();
                    element.printInvalid();
                    break;
            }
        }
    }
}
