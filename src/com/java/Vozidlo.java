package com.java;

public class Vozidlo {
    private int pasazieri; // počet pasažierov
    private int nadrz; // kapacita paliva v litroch
    private int spotreba; // spotreba paliva v litroch na 100 km

    Vozidlo(int p, int o, int s) {
        pasazieri = p;
        nadrz = o;
        spotreba = s;
    }

    int dojazd() {
        return 100*nadrz/spotreba;
    }

    double potrebnepalivo(int kilometrov) {
        return (double) kilometrov*spotreba/100;
    }

    int vratPasazieri() { return pasazieri; }
    void nastavPasazieri(int p) { pasazieri = p; }
    int vratObjNadrze() { return nadrz; }
    void nastavObjNadrze(int o) { nadrz = o; }
    int vratSpotrebu() { return spotreba; }
    void nastavSpotrebu(int s) { spotreba = s; }
}

