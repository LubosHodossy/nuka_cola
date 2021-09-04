package Vynimky;

public class BlokFinally {
    public static void generujVynimku(int co) {
        int t;
        int cisla[] = new int[2];

        System.out.println("Príjmam " + co);
        try {
            switch(co) {
                case 0:
                    t = 10 / co;  // vygeneruje chybu delenia nulou
                    break;
                case 1:
                    cisla[4] = 4;  // vygeneruje chybu prekročenia hranice pola
                    break;
                case 2:
                    return;  // návrat z bloku try
            }
        }
        catch (ArithmeticException vynimka) {
            // zachytenie vynimky
            System.out.println("Nemôžem deliť nulou!");
            return;  // návrat z catch
        }
        catch (ArrayIndexOutOfBoundsException vynimka) {
            // zachytenie vynimky
            System.out.println("Nebol nájdený žiadny odpovedajúci prvok.");
        }
        finally {
            System.out.println("Opúšťam try.");
        }
    }
}

class UkazkaFinally {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            BlokFinally.generujVynimku(i);
            System.out.println();
        }
    }
}
