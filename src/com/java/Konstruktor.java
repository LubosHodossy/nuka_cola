package com.java;

public class Konstruktor {
    int x;

    Konstruktor(int i) {
        x = i;
    }
}

class UkazkaKonstruktor {
    public static void main(String[] args) {
        Konstruktor k1 = new Konstruktor(10);
        Konstruktor k2 = new Konstruktor(88);

        System.out.println(k1.x + " " + k2.x);
    }
}
