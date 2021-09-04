package Vynimky;

public class ViacnasobneZachytenie {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int vysledok;
        char znaky[] = { 'A', 'B', 'C' };

        for (int i=0; i<2; i++) {
            try {
                if (i == 0)
                    vysledok = a/b;
                else
                    znaky[5] = 'X';
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Zachytená výnimka: " + e);
            }
        }
        System.out.println("Po viacnásobnom zachytení.");
    }
}
