package UAP;

import java.util.*;

public class Case3Interface {
    public static void main(String[] args) {
        Case3Class books = new Case3Class();
        Queue<String> queue = new LinkedList<>();

        queue.add("budi");
        queue.add("andri");
        queue.add("jeki");

        while (books.getCondition()) {
            books.printQueue();
            System.out.println(queue);
            books.printDomain();
            books.printInput();

            if (books.getName().equalsIgnoreCase("close")) {
                books.printDomain();
                books.printQueue();
                System.out.println(queue);
                books.printExit();
            }

            if (!books.nameAlreadyEntered(books.getName())) {
                if (queue.size() < 3) {
                    queue.add(books.getName());
                    books.addNameAlready();
                } else {
                    String out = queue.poll();
                    System.out.println("[" + out + "] Got the book");
                    queue.add(books.getName());
                    books.addNameAlready();
                }
            } else {
                books.printDomain();
                books.printNameAlreadyEntered();
            }
        }
    }
}
