package week1;

public class case1class {
    private int koin;
    public int saldo = 0;

    void printMenu() {
        System.out.println("Welcome!! \nMenu :");
        System.out.println("1.Input Coin \n2.Take Coin \n3.Check Coin \n0.Exit");
        System.out.print("Your Choose : ");
    }

    void printSimpan() {
        System.out.println("--Input Coin--");
        System.out.println("Choose The Type of Coin");
        System.out.println("1.500 \n2.200 \n3.100");
        System.out.print("Your Choose : ");
    }

    void printAmbil() {
        System.out.println("--Take Coin--");
        System.out.println("Choose The Type of Coin");
        System.out.println("1.500 \n2.200 \n3.100");
        System.out.print("Your Choose : ");
    }

    public int getKoin() {
        return koin;
    }

    public int totalSaldo() {
        return saldo;
    }

    public int simpanKoin(int koin) {
        return saldo += koin;
    }

    public int ambilKoin(int koin) {
        if (saldo >= koin) {
            return saldo -= koin;
        } else {
            System.out.println("Sorry, Not Enough Coin");
        }
        return 0;
    }
}
