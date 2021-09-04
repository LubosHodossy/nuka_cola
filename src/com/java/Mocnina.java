package com.java;

public class Mocnina {
    double b;
    int e;
    double vysledok;

    Mocnina(double zaklad, int exp) {
        this.b = zaklad;
        this.e = exp;
        this.vysledok = 1;

        if (exp == 0) return;
        for ( ; exp>0; exp--) this.vysledok = this.vysledok * zaklad;
    }

    double vrat_mocninu() {
        return this.vysledok;
    }
}

class UkazkaMocnina {
    public static void main(String[] args) {
        Mocnina x = new Mocnina(4.0, 2);
        Mocnina y = new Mocnina(2.5, 1);
        Mocnina z = new Mocnina(5.7, 0);

        System.out.println(x.b + " umocneno na " + x.e + " je " + x.vrat_mocninu());
        System.out.println(y.b + " umocneno na " + y.e + " je " + y.vrat_mocninu());
        System.out.println(z.b + " umocneno na " + z.e + " je " + z.vrat_mocninu());
    }
}
