package week4;

public class case4main {
    public static void main(String[] args) {
        case4class quicksort = new case4class();
        
        do {
            quicksort.printMenu();

            if (quicksort.getSize() == 0 || quicksort.getSize() < 0 || quicksort.getSize() < 10) {
                quicksort.printDisable();
            } else if (quicksort.getSize() >= 10) {
                quicksort.printValueArr();
                quicksort.printDomain();
                quicksort.printArrBefore();
                quicksort.quicksort(quicksort.arr, 0, quicksort.getSize() - 1);
                quicksort.printDomain();
                quicksort.printArrAfter();
            }
            quicksort.printLoop();
            switch (quicksort.getChoose()) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Thank you for using this program");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice please choose 1 or 2");
                    System.out.println("Please rerun the program!!");
                    System.exit(0);
            }
        } while (quicksort.getChoose() != 2);
    }
}
