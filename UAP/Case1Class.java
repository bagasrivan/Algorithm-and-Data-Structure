package UAP;

import java.util.*;

public class Case1Class {
    private int numb, sort;
    LinkedList<Integer> number = new LinkedList<>();
    LinkedList<Integer> index = new LinkedList<>();
    Scanner input = new Scanner(System.in);

    public int getNumb() {
        return numb;
    }

    public int getSort() {
        return sort;
    }

    void printInput() {
        System.out.println(">>>> Welcome <<<<");
        System.out.println("Please input 8 numbers");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number-" + (i + 1) + " : ");
            int numb = input.nextInt();
            number.add(numb);
            index.add(i + 1);
        }
    }

    void printNumber() {
        System.out.println("All number : ");
        for (Integer data : number) {
            System.out.print(data + " ");
        }
        System.out.println("");
    }

    void sorting(LinkedList<Integer> number, LinkedList<Integer> index) {
        for (int k = 0; k < number.size(); k++) {
            for (int j = 0; j < number.size() - 1; j++) {
                if (number.get(j) < number.get(j + 1)) {
                    int temp = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, temp);

                    int tempIndex = index.get(j);
                    index.set(j, index.get(j + 1));
                    index.set(j + 1, tempIndex);
                }
            }
        }
    }

    void printSort() {
        System.out.println("Descending sort:");
        for (Integer dataIndex : index) {
            System.out.print(dataIndex + " ");
        }
        System.out.println("");
    }
}
