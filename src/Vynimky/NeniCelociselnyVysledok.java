package Vynimky;

public class NeniCelociselnyVysledok extends Exception {
    int citatel;
    int menovatel;

    NeniCelociselnyVysledok(int i, int j) {
        citatel = i;
        menovatel = j;
    }

    public String toString() {
        return "Výsledok " + citatel + " / " + menovatel + " neni celé číslo.";
    }
}

class UkazkaVlastnaVynimka {
    public static void main(String[] args) {
        int citatel[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int menovatel[] = { 2, 0, 4, 4, 0, 8 };

        for (int i=0; i<citatel.length; i++) {
            try {
                if ((citatel[i] % 2) != 0)
                    throw new NeniCelociselnyVysledok(citatel[i], menovatel[i]);
                System.out.println(citatel[i] + " / " + menovatel[i] + " = " + citatel[i]/menovatel[i]);
            }
            catch (ArithmeticException vynimka) {
                // zachytenie výnimky
                System.out.println("Nemôžem deliť nulou.");
            }
            catch (ArrayIndexOutOfBoundsException vynimka) {
                // zachytenie výnimky
                System.out.println("Nebol nájdený žiadny odpovedajúci prvok.");
            }
            catch (NeniCelociselnyVysledok vynimka) {
                System.out.println(vynimka);
            }
        }
    }
}
