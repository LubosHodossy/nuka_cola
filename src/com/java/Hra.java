package com.java;

public class Hra {
    public static void main(String[] args) throws java.io.IOException {
        char zn, ignoruj, odpoved = 'K';

        do {
            System.out.println("Myslím na písmeno medzi A až Z.");
            System.out.print("Skús ho uhádnuť: ");
            zn = (char) System.in.read();
            do {
                ignoruj = (char) System.in.read();
            } while (ignoruj != '\n');

            if (zn == odpoved) System.out.println("** Správne **");
            else {
                System.out.print("...Prepáč, ale si ");
                if (zn < odpoved) System.out.println("príliš nízko");
                else System.out.println("príliš vysoko");
                System.out.println("Skús to znova!\n");
            }
        } while (odpoved != zn);
    }
}
