package Vynimky;

public class UkazkaVynimky3 {
    public static void main(String[] args) {
        int citatel[] = { 4, 8, 16, 32, 64, 128 };
        int menovatel[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < citatel.length; i++) {
            try {
                System.out.println(citatel[i] + " / " + menovatel[i] + " = " + citatel[i]/menovatel[i]);
            }
            catch (ArithmeticException vynimka) {
                System.out.println("Nemôžem deliť nulou !");
            }
        }
    }
}
