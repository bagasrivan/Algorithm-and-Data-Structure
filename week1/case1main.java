package week1;

import java.util.*;

public class case1main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        case1class tabungan = new case1class();

        int choose;
        int typeCoin;
        int coin = tabungan.getKoin();
        do {
            tabungan.printMenu();
            choose = input.nextInt();
            if (choose == 1) {
                tabungan.printSimpan();
                typeCoin = input.nextInt();

                switch (typeCoin) {
                    case 1:
                        coin = 500;
                        System.out.println(">>Input Coin Succesfully!!<<");
                        break;
                    case 2:
                        coin = 200;
                        System.out.println(">>Input Coin Succesfully!!<<");
                        break;
                    case 3:
                        coin = 100;
                        System.out.println(">>Input Coin Succesfully!!<<");
                        break;
                    default:
                        System.out.println("Invalid Coin!!");
                        break;
                }
                tabungan.simpanKoin(coin);
            } else if (choose == 2) {
                tabungan.printAmbil();
                typeCoin = input.nextInt();

                switch (typeCoin) {
                    case 1:
                        coin = 500;
                        break;
                    case 2:
                        coin = 200;
                        break;
                    case 3:
                        coin = 100;
                        break;
                    default:
                        System.out.println("Invalid Coin!!");
                        break;
                }
                tabungan.ambilKoin(coin);
            } else if (choose == 3) {
                System.out.println("--Check Coin--");
                System.out.println("Total of Coins : " + tabungan.totalSaldo());
            } else if (choose == 0) {
                System.out.println("--Program Exit--");
                System.out.println(">>Thank You!!<<");
            } else {
                System.out.println(">>Invalid Menu!!<<");
            }
        } while (choose != 0);
    }
}
