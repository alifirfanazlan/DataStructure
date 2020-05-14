
package week2ds;

public class SpecialEncoding<T> {

    private String code;
    private T[] t;

    public SpecialEncoding(T[] t) {
        this.t = t;

        if (t instanceof Character[]) {
            Letter();
        } else if (t instanceof Integer[]) {
            Number();
        }
    }

    public void Number() {
        System.out.println("The code are :");
        for (T a : t) {
            System.out.println(a + " ");
        }
        System.out.println("The command are:");
        for (T a : t) {
            if ((Integer) a == 0) {
                System.out.println("Copy");
            } else if ((Integer) a == 1) {
                System.out.println("Delete");
            } else if ((Integer) a == 2) {
                System.out.println("Insert");
            } else if ((Integer) a == 3) {
                System.out.println("Print");
            } else if ((Integer) a == 4) {
                System.out.println("Rename");
            } else if ((Integer) a == 5) {
                System.out.println("Paste");
            } else {
                System.out.println("");
            }
        }

    }

    public void Letter() {
        System.out.println("The code are :");
        for (T a : t) {
            System.out.println(a + " ");
        }
        System.out.println("The command are:");

        for (T a : t) {
            if ((Character) a == 'C') {
                System.out.println("Copy");
            } else if ((Character) a == 'D') {
                System.out.println("Delete");
            } else if ((Character) a == 'I') {
                System.out.println("Insert");
            } else if ((Character) a == 'P') {
                System.out.println("Print");
            } else if ((Character) a == 'R') {
                System.out.println("Rename");
            } else if ((Character) a == 'V') {
                System.out.println("Paste");
            } else {
                System.out.println("");
            }
        }

    }
}
