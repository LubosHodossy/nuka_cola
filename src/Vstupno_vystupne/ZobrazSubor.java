package Vstupno_vystupne;
import java.io.*;

public class ZobrazSubor {
    public static void main(String [] args) {
        int i;
        FileInputStream prud;

        if (args.length != 1) {
            System.out.println("Použitie: ZobrazSubor NázovSúboru");
            return;
        }

        try {
            prud = new FileInputStream(args[0]);
        } catch (FileNotFoundException vynimka) {
            System.out.println("Súbor nenájdený.");
            return;
        }

        try {
            do {
                i = prud.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);
        } catch (IOException vynimka) {
            System.out.println("Chyba pri čítaní súboru.");
        } finally {
            try {
                prud.close();
            } catch (IOException vynimka) {
                System.out.println("Chyba pri zatváraní súboru.");
            }
        }
    }
}
