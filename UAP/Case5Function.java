package UAP;

import java.util.*;

public class Case5Function {
    private Stack<Case5Class> stack;
    private int totalCargo;
    private String cargoName;
    Scanner input = new Scanner(System.in);

    public Case5Function() {
        this.stack = new Stack<>();
    }

    public int getTotalCargo() {
        return totalCargo;
    }

    public String getCargoName() {
        return cargoName;
    }

    void push(Case5Class cargo) {
        stack.push(cargo);
        System.out.println("Cargo '" + cargo.getName() + "' added to stack");
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Case5Class pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, there is no cargo to pick");
            return null;
        } else {
            Case5Class cargo = stack.pop();
            System.out.println("Cargo '" + cargo.getName() + "' was picked from stack");
            return cargo;
        }
    }

    public Case5Class peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, there is no cargo to see");
            return null;
        } else {
            return stack.peek();
        }
    }

    void printInputCargo() {
        System.out.println(">>>>Welcome<<<<");
        System.out.print("Input total of cargo : ");
        totalCargo = input.nextInt();
    }

    void printDomain() {
        System.out.println("========");
    }
}
