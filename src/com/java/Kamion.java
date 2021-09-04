package com.java;

public class Kamion extends Vozidlo {
    private int nosnost; // nosnosť pre náklad v kg

    Kamion(int p, int o, int s, int n) {
        super(p, o, s);

        nosnost = n;
    }

    int vratNosnost() { return nosnost; }
    void nastavNosnost(int n) { nosnost = n; }
}
