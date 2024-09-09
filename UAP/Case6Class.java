package UAP;

import java.util.Scanner;

public class Case6Class {
    private String title, description;
    private int choose;
    Scanner input = new Scanner(System.in);

    public Case6Class(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public String getTitle() {
        return title;
    }

    public int getChoose() {
        return choose;
    }

    void printMenu() {
        System.out.println(">>>>Welcome<<<<");
        System.out.println("1.Input to do list \n2.Delete to do list \n3.Print to do list \n4.Exit");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void printInputTitle() {
        System.out.print("Input title : ");
        title = input.next();
    }

    void printInputDesc() {
        System.out.print("Input description : ");
        description = input.next();
    }

    void printSuccess() {
        System.out.println("Progress successfully!!");
    }

    void printIsEmpty() {
        System.out.println("To do list is empty");
    }

    void printTopStack() {
        System.out.println("Your last to do  list is : ");
    }

    void printStack() {
        System.out.println("All your to do list now : ");
    }

    void backMenu() {
        System.out.println("You will back to menu");
    }

    void printInvalid() {
        System.out.println("Invalid option, please input valid option");
    }

    void printExit() {
        System.out.println("Thank you!!");
        System.exit(0);
    }

    void printDomain() {
        System.out.println("========");
    }

    void confirDelete() {
        System.out.println("Do you want to delete it?");
        System.out.println("1.Yes \n2.No");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }
}
