package UAP;

import java.util.*;

public class Case7Class {
    private int choose;
    private String title, desc;
    private boolean check = true;
    Scanner input = new Scanner(System.in);

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getChoose() {
        return choose;
    }

    public boolean getCheck() {
        return check;
    }

    void printMenu() {
        System.out.println(">>>>Welcome<<<<");
        System.out.println("1.Input to do list \n2.Delete to do list \n3.Print to do list \n4.Exit");
        System.out.print("Your choice : ");
        choose = input.nextInt();
    }

    void printSuccessInput() {
        System.out.println("Progress successfully!! " + title + " was added to task list");
    }

    void printSuccessDelete() {
        System.out.println("Progress successfully!! " + title + " was removed from task list");
    }

    void inputTitle() {
        System.out.print("Input title : ");
        title = input.next();
    }

    void inputDesc() {
        System.out.print("Input description : ");
        desc = input.next();
    }

    void invalidTitle() {
        System.out.println("Invalid title!!");
    }

    void printIsEmpty() {
        System.out.println("To do list is empty");
    }

    void printDomain() {
        System.out.println("========");
    }

    void printInvalid() {
        System.out.println("Invalid option, please input valid option");
    }

    void printExit() {
        System.out.println("Thank you!!");
        System.exit(0);
    }
}
