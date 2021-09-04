package Vynimky;

public class UkazkaVynimky5 {
    public static void main(String[] args) {
        int citatel[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int menovatel[] = { 2, 0, 4, 4, 0, 8 };

        for (int i=0; i < citatel.length; i++) {
            try {
                System.out.println(citatel[i] + " / " + menovatel[i] + " = " + citatel[i]/menovatel[i]);
            }
            catch (ArrayIndexOutOfBoundsException vynimka) {
                System.out.println("Nebol nájdený žiadny odpovedajúci prvok.");
            }
            catch (Throwable vynimka) {
                System.out.println("Došlo k nejakej výnimke.");
            }
        }
    }
}
