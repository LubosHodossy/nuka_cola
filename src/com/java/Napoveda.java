package com.java;

public class Napoveda {
    void napovedaPro(int co) {
        switch (co) {
                case '1':
                    System.out.println("Príkaz if:\n");
                    System.out.println("if (podmienka) príkaz;");
                    System.out.println("else príkaz;");
                    break;
                case '2':
                    System.out.println("Príkaz switch:\n");
                    System.out.println("switch (výraz) {");
                    System.out.println("   case konštanta:");
                    System.out.println("      postupnosť príkazov");
                    System.out.println("      break;");
                    System.out.println("   // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Príkaz for:\n");
                    System.out.print("for (inicializácia; podmienka; iterácia)");
                    System.out.println(" príkaz;");
                    break;
                case '4':
                    System.out.println("Príkaz while:\n");
                    System.out.println("while (podmienka) príkaz;");
                    break;
                case '5':
                    System.out.println("Príkaz do-while:\n");
                    System.out.println("do {");
                    System.out.println("   príkaz;");
                    System.out.println("} while (podmienka);");
                    break;
                case '6':
                    System.out.println("Príkaz break:\n");
                    System.out.println("break; alebo break štítok");
                    break;
                case '7':
                    System.out.println("Príkaz continue:\n");
                    System.out.println("continue; alebo continue štítok;");
                    break;
            }
            System.out.println();
        }

        void zobrazNabidku() {
            System.out.println("Nápoveda pro:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break");
            System.out.println(" 7. continue\n");
            System.out.println("Vyberte jeden (k pre koniec): ");
    }

    boolean jePlatny(int zn) {
        if (zn < '1' | zn > '7' & zn != 'k') return false;
        else return true;
    }
}

class UkazkaTriedyNapoveda {
    public static void main(String[] args) throws java.io.IOException {
        char volba, ignoruj;
        Napoveda objNapoveda = new Napoveda();

        for (;;) {
            do {
                objNapoveda.zobrazNabidku();
                volba = (char) System.in.read();

                do {
                    ignoruj = (char) System.in.read();
                } while (ignoruj != '\n');
            } while ( !objNapoveda.jePlatny(volba) );

            if (volba == 'k') break;
            System.out.println("\n");
            objNapoveda.napovedaPro(volba);
        }
    }
}
