package Testovanie;

import java.io.IOException;
import java.util.Scanner;

class Test2 {
    public static void main(String[] args) throws IOException {
        char odpoved;
        char spravne;
        int A = 9;
        int B = 11;
        int C = 13;

        do {
            System.out.println("Koľko filmov zrežíroval Tarantino ?");
            System.out.println("A: 9\nB: 11\nC: 13");
            System.out.println("Sem napíš odpoveď: (A/B/C) ");
            System.in.read();

            if (C == 13) {
                System.out.println("Správne.");
            } else {
                System.out.println("Nesprávne.");
            }
        } while (false);
    }
}
