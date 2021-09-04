package Vynimky;

public class VnoreneTry {
    public static void main(String[] args) {
        int citatel[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int menovatel[] = { 2, 0, 4, 4, 0, 8 };

        try {
            for (int i=0; i < citatel.length; i++) {
                try {
                    System.out.println(citatel[i] + " / " + menovatel[i] + " = " + citatel[i]/menovatel[i]);
                }
                catch (ArithmeticException vynimka) {
                    System.out.println("Nemôžem deliť nulou.");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException vynimka) {
            System.out.println("Nebol nájdený žiadny zodpovedný prvok.");
            System.out.println("Fatálná chyba - program sa ukončí.");
        }
    }
}
