package com.java;

public class Odmocnina {
    public static void main(String[] args) {
        double cislo, odmocnina, zchyba;

        for (cislo = 1.0; cislo < 100.0; cislo++) {
            odmocnina = Math.sqrt(cislo);
            System.out.println("Odmocnina z " + cislo + " je " + odmocnina);

            zchyba = cislo - (odmocnina * odmocnina);
            System.out.println("Zaokruhlovacia chyba je " + zchyba);
            System.out.println();
        }
    }
}
