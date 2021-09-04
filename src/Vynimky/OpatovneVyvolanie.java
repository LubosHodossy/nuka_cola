package Vynimky;

public class OpatovneVyvolanie {
    public static void generujVynimku() {
        int citatel[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int menovatel[] = { 2, 0, 4, 4, 0, 8 };

        for (int i=0; i<citatel.length; i++) {
            try {
                System.out.println(citatel[i] + " / " + menovatel[i] + " = " + citatel[i]/menovatel[i]);
            }
            catch (ArithmeticException vynimka) {
                System.out.println("Nemôžem deliť nulou.");
            }
            catch (ArrayIndexOutOfBoundsException vynimka) {
                System.out.println("Nebol nájdený žiadny odpovedajúci prvok.");
                throw vynimka;
            }
        }
    }
}

class UkazkaOpatovneVyvolanie {
    public static void main(String[] args) {
        try {
            OpatovneVyvolanie.generujVynimku();
        }
        catch(ArrayIndexOutOfBoundsException vynimka) {
            System.out.println("Fatálná chyba - program sa ukončí.");
        }
    }
}
