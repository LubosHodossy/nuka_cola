package Vynimky;

public class UkazkaThrow {
    public static void main(String[] args) {
        try {
            System.out.println("Pred vyvolaním výnimky.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException vynimka) {
            System.out.println("Výnimka zachytená.");
        }
        System.out.println("Za blokom try/catch.");
    }
}
