package Praktikum7;

import java.util.*;

public class Case7Class {
    Scanner input = new Scanner(System.in);
    private String[] stack;
    private int max;
    private int top;
    private int chooseMainMenu, chooseDrink;

    public int getChooseMainMenu() {
        return chooseMainMenu;
    }

    public int getChooseDrink() {
        return chooseDrink;
    }

    public Case7Class(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public void push(String value) {
        stack[++top] = value;
    }

    public String pop() {
        return stack[top--];
    }

    public String peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    void printSuccess() {
        System.out.println("Succesfully picked up the drink");
        System.out.print("The drink picked up is : ");
    }

    void printBack() {
        System.out.println("You will back to menu");
    }

    void printIfEmpty() {
        System.out.println("Sorry, the drink out of stock");
    }

    void printLastIfEmpty() {
        System.out.println("There is none of drink, because the drink out of stock");
    }

    void printInvalid() {
        System.out.println("Invalid choice!!");
    }

    void printThankYou() {
        System.out.println("Thank you!!");
    }

    void printDomain() {
        System.out.println("=======");
    }

    void printAwarness() {
        System.out.println("WARNING, YOU CAN ONLY PICK UP THE LAST DRINK IN LIST");
    }

    void printMainMenu() {
        System.out.println(">>>>Welcome to Free Vending Machine<<<<");
        System.out.println("1.Take \n2.Exit");
        System.out.print("Your choice : ");
        chooseMainMenu = input.nextInt();
    }

    void listDrink() {
        printDomain();
        printStack();
        printDomain();
        System.out.println("1.Pick up drink \n2.Check the last drink (will out if you pick it) \n3.Back");
        System.out.print("Your choice : ");
        chooseDrink = input.nextInt();
    }
}
