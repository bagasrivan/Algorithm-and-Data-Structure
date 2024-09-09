package UAP;

import java.util.*;

public class Case5Interface {
    public static void main(String[] args) {
        Case5Function cargo = new Case5Function();
        Scanner input = new Scanner(System.in);
        String name = cargo.getCargoName();

        cargo.printDomain();
        cargo.printInputCargo();
        for (int i = 0; i < cargo.getTotalCargo(); i++) {
            cargo.printDomain();
            System.out.print("Input cargo name number-" + (i + 1) + " :");
            name = input.next();
            Case5Class cargoStack = new Case5Class(name);
            cargo.push(cargoStack);
        }
        cargo.printDomain();
        System.out.println("The top position of cargo : " + cargo.peek().getName());
    }
}
