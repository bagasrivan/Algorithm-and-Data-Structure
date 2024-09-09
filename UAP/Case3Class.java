package UAP;

import java.util.*;

public class Case3Class {
    private int choose;
    private boolean condition = true;
    private String name;
    private Set<String> nameEntered = new HashSet<>();
    Scanner input = new Scanner(System.in);

    public int getChoose() {
        return choose;
    }

    public boolean getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    public boolean nameAlreadyEntered(String name) {
        return nameEntered.contains(name);
    }

    void addNameAlready() {
        nameEntered.add(name);
    }

    void printInput() {
        System.out.print("Input name (close for end program) : ");
        name = input.next();
    }

    void printQueue() {
        System.out.print("Queue : ");
    }

    void printExit() {
        System.out.println("Program exit, thank you");
        System.exit(0);
    }

    void printNameAlreadyEntered() {
        System.out.println("Sorry, the name already got the book!!");
    }

    void printDomain() {
        System.out.println("========");
    }
}
