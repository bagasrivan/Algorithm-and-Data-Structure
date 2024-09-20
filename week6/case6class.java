package week6;

import java.util.*;

public class case6class {
    Scanner input = new Scanner(System.in);
    private int chooseMainMenu, chooseGroceries;
    private int stock = 3;

    //Enkapsulasi (getter) untuk mengembalikan nilai variabel chooseMainMenu
    public int getChooseMainMenu() {
        return chooseMainMenu;
    }

    //Enkapsulasi (getter) untuk mengembalikan nilai variabel chooseGroceries
    public int getChooseGroceries() {
        return chooseGroceries;
    }

    //Enkapsulasi (getter) untuk mengembalikan nilai variabel stock
    public int getStock() {
        return stock;
    }

    //Method prosedur untuk menampilkan main menu dan menyimpan input user ke dalam variabel chooseMainMenu
    void printMainMenu() {
        System.out.println(">>>>Welcome to Basic Foods Distribution Program<<<<");
        System.out.println("1.Enter \n2.Exit");
        System.out.print("Your choice : ");
        chooseMainMenu = input.nextInt();
    }

    //Method prosedur untuk memberikan batas pada output
    void printDomain() {
        System.out.println(" ");
    }

    //Method prosedur untuk menampilkan "Say Welcome"
    void printWelcome() {
        System.out.println("Welcome to Distribution Food menu");
    }

    //Method prosedur untuk menampilkan sisa stock dan terdapat fungsi decrement pada variabel stock
    void printStock() {
        System.out.println("Stock of Groceries : " + stock);
        stock--;
    }

    //Method prosedur untuk menampilkan peringatan stock sembako habis
    void printOutOfStock () {
        System.out.println("The groceries out of stock, unable to continue");
    }

    //Method prosedur untuk menampilkan keterangan menyelesaikan antrian dan selesainya program
    void printClose() {
        System.out.println("Queue closed, program finished");
    }

    //Method prosedur untuk menampilkan keterangan invalid pada input user
    void printInvalid() {
        System.out.println("Invalid choice");
    }

    //Method prosedur untuk menampilkan menu pilihan lanjut mengambil sembako atau memberhentikan pengambilan sembako
    void printMenuGroceries() {
        System.out.println("1.Next queue \n2.Close queue");
        System.out.print("Choose : ");
        chooseGroceries = input.nextInt();
    }

    //Method prosedur untuk menampilkan keterangan exit program dan memberhentikan program saat method dipanggil
    void printExit() {
        System.out.println("Program exit, thank you!!");
        System.exit(0);
    }
}
