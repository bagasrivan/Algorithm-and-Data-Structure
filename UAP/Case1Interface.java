package UAP;

public class Case1Interface {
    public static void main(String[] args) {
        Case1Class sort = new Case1Class();

        sort.printInput();
        sort.printNumber();
        sort.sorting(sort.number, sort.index);
        sort.printSort();
    }
}
