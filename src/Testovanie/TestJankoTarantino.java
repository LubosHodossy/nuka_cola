package Testovanie;

public class TestJankoTarantino {
    public static void main(String[] args)
    throws java.io.IOException {
        char zn, ignoruj, odpoved = 'A';

        do {
            System.out.println( " Koľko filmov natočil Quentin Tarantino? ");
            System.out.println(" tu su možnosti ");
            System.out.println("\n A = 13 \n B = 6 \n C = 11");

            zn = (char) System.in.read();
            do {
                ignoruj = (char) System.in.read();
            }while (ignoruj != '\n');

            if (zn == odpoved) System.out.println(" Správne. ");
            else {
                System.out.println("...tak to si úplne mimo!");
                System.out.println(" Skús to znovu.");
            }
        } while (odpoved != zn);

    }
}
