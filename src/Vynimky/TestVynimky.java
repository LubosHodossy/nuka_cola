package Vynimky;

public class TestVynimky {
    static void generujVynimku() {
        int cisla[] = new int[4];

        System.out.println("Pred vygenerovaním výnimky.");

        cisla[7] = 10;
        System.out.println("Toto sa nezobrazí.");
    }
}

class MetodyThrowable {
    public static void main(String[] args) {
        try {
            TestVynimky.generujVynimku();
        }
        catch (ArrayIndexOutOfBoundsException vynimka) {
            System.out.println("Štandardná správa: ");
            System.out.println(vynimka);
            System.out.println("\nZásobník volaní: ");
            vynimka.printStackTrace();
        }
        System.out.println("Po príkaze catch.");
    }
}
