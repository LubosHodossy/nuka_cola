package com.java;

public class DoWhile {
    public static void main(String[] args) throws java.io.IOException {
        char zn;

        do {
            System.out.print("Stlačte klávesu a následne ENTER: ");
            zn = (char) System.in.read();
        } while (zn != 'k');
    }
}
