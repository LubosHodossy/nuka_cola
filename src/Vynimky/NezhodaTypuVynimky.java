package Vynimky;

public class NezhodaTypuVynimky {
    public static void main(String[] args) {
        int cisla[] = new int[4];

        try {
            System.out.println("Pred vygenerovaním výnimky.");

            cisla[7] = 10;
            System.out.println("Toto sa nezobrazí.");
        }
        catch (ArithmeticException vynimka) {
            System.out.println("Index mimo hranice!");
        }
        System.out.println("Po príkaze catch.");
    }
}
