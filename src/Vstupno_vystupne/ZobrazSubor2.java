package Vstupno_vystupne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZobrazSubor2 {
    public static void main(String[] args) {
        int i;
        FileInputStream prud = null;

        if (args.length != 1) {
            System.out.println("Použitie: ZobrazSubor2 NazovSuboru");
            return;
        }

        try {
            prud = new FileInputStream(args[0]);
            do {
                i = prud.read();
                if (i != -1) System.out.println((char) i);
            }
            while (i != -1);
        }
        catch (FileNotFoundException vynimka) {
            System.out.println("Súbor nenájdený.");
        }
        catch (IOException vynimka) {
            System.out.println("Došlo k vstupno výstupnej chybe.");
        }
        finally {
            try {
                if (prud != null) prud.close();
            }
            catch (IOException vynimka) {
                System.out.println("Chyba pri zatváraní súboru.");
            }
        }
    }
}
