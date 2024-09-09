package UTP;

public class UTPInterface {
    public static void main(String[] args) {
        UTPClass utp = new UTPClass();

        do {
            utp.printMenu();

            switch (utp.getChooseLogin()) {
                case 1:
                    utp.inputData();
                    break;
                case 2:
                    do {
                        utp.dataList();
                    } while (utp.getChooseList() != 3);
                    break;
                case 3:
                    utp.printThankYou();
                    break;
                default:
                    utp.printInvalid();
                    break;
            }
        } while (utp.getChooseLogin() != 3);
    }
}
