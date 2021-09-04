package Vynimky;

public class UkazkaVynimky1 {
    public static void main(String[] args) {
        int cisla[] = new int[4];

        try {
            System.out.println("Pred vygenerovaním výnimky.");

            cisla[7] = 10;
            System.out.println("Toto sa nezobrazí.");
        }
        catch (ArrayIndexOutOfBoundsException vynimka) {
            System.out.println("Index mimo hranice!");
        }
        System.out.println("Po príkaze catch.");
    }
}
