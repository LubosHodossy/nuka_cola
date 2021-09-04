package Testovanie;

import java.io.IOException;
import java.util.Scanner;

class Test1 {
    public static void main(String[] args) throws IOException {
        int odpoved;
        boolean Správne = true;
        boolean Nesprávne = false;

        System.out.println("Koľko filmov zrežíroval Tarantino ?");
        System.out.println("(9, 11, alebo 13)");
        System.out.println("Sem napíš odpoveď: ");
        System.in.read();
        boolean A = false;
        boolean B = false;
        boolean C = true;


        if (Správne) {
            System.out.println("Skurvene správne.");
        }
        else
            System.out.println("Ani náhodou...");
    }
}
