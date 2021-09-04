package com.java;

public class CelociselneMocniny {
    public static void main(String[] args) {
        int e;
        int vysledok;

        for (int i=0; i < 10; i++) {
            vysledok = 1;
            e = i;
            while (e > 0) {
                vysledok *= 2;
                e--;
            }
            System.out.println("2 na " + i + " je " + vysledok);
        }
    }
}
