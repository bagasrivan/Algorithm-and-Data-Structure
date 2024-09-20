package week2;

import java.util.*;

public class case2class {
    private int n;
    private int choose;
    Scanner input = new Scanner(System.in);

    public int getN() {
        return n;
    }

    public int getChoose() {
        return choose;
    }

    void printNol() {
        System.out.println("Sorry, the value cannot be 0");
    }

    void printNegative() {
        System.out.println("Sorry, the value cannot be negative");
    }

    void printMenu() {
        System.out.println("\nWelcome");
        System.out.println(">>>>Factorial Program<<<<");
        System.out.print("Input the Value : ");
        n = input.nextInt();
    }

    void printRecursive() {
        System.out.println();
        int[] number = new int[n];
        int newNumber = n;
        System.out.print(n);
        for (int data : number) {
            newNumber--;
            if (newNumber != 0) {
                System.out.print(" x " + newNumber);
            }
        }
        System.out.print(" = ");
    }

    public int factorialOpr(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialOpr(n - 1);
    }

    void printConfirmLoop() {
        System.out.println("\n======");
        System.out.println("\n1.Yes \n2.No");
        System.out.print("Do you want to recalculate? : ");
        choose = input.nextInt();
    }
}
