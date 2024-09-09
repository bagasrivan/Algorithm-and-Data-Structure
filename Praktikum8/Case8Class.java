package Praktikum8;

import java.util.*;

public class Case8Class {
    private int numb, choose;
    private String type;
    private boolean check = true;

    private HashMap<Integer, Object> map;
    Scanner input = new Scanner(System.in);

    void printMenu() {
        System.out.println(">>>>Welcome to Brian Auto Parking<<<<");
        System.out.println("1.Parking your car \n2.Pickup your car \n3.Check parking condition \n4.Exit");
        System.out.print("Your choice : ");
    }

    void printParking() {
        System.out.print("Enter parking number : ");
        numb = input.nextInt();
        System.out.print("Enter your car type : ");
        type = input.next();
        addData(numb, type);
        System.out.println("Parking successfully!!");
    }

    void printPickup() {
        System.out.print("Enter parking number to remove : ");
        numb = input.nextInt();

        if (!containsKey(numb)) {
            System.out.println("Parking slot " + numb + " does not have a car parked.");
        } else {
            removeData(numb);
            System.out.println("Pick up car successfully!!");
        }
    }

    void printParkingCond() {
        System.out.print("Enter number parking slot that you want to check : ");
        numb = input.nextInt();
        System.out.println("Slot : " + numb);
        System.out.println("Car type : " + getKey(numb));
    }

    void printExit() {
        System.out.println("Program exit, thank you for used this program!!");
        exit();
    }

    void printInvalid() {
        System.out.println("Invalid option, please choose a valid option");
    }

    void printIsEmpty() {
        System.out.println("Parking slot is empty");
    }

    void printDomain() {
        System.out.println("======");
    }

    void exit() {
        System.exit(0);
    }

    public Case8Class() {
        map = new HashMap<>();
    }

    public void addData(int key, Object value) {
        map.put(key, value);
    }

    public Object getKey(int key) {
        return map.get(key);
    }

    public void removeData(int key) {
        map.remove(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean containsKey(int key) {
        return map.containsKey(key);
    }

    public int getNumb() {
        return numb;
    }

    public String getType() {
        return type;
    }

    public boolean getCheck() {
        return check;
    }

    public int getChoose() {
        return choose;
    }
}
