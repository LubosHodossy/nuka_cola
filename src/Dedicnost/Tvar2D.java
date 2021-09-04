package Dedicnost;

abstract class Tvar2D {
    private double sirka;
    private double vyska;
    private String nazov;

    Tvar2D() {
        sirka = vyska = 0.0;
        nazov = "žiadny";
    }

    Tvar2D(double s, double v, String n) {
        sirka = s;
        vyska = v;
        nazov = n;
    }

    Tvar2D(double x, String n) {
        sirka = vyska = x;
        nazov = n;
    }

    Tvar2D(Tvar2D obj) {
        sirka = obj.sirka;
        vyska = obj.vyska;
        nazov = obj.nazov;
    }

    double vratSirku() {
        return sirka;
    }
    double vratVysku() {
        return vyska;
    }
    void nastavSirku(double s) {
        sirka = s;
    }
    void nastavVysku(double v) {
        vyska = v;
    }

    String vratNazov() { return nazov; }

    void zobrazRozmery() {
        System.out.println("Šírka a výška sú " + sirka + " a " + vyska);
    }

    abstract double plocha();
}

class Trojuholnik extends Tvar2D {
    private String styl;

    Trojuholnik() {
        super();
        styl = "žiadny";
    }

    Trojuholnik(String st, double s, double v) {
        super(s, v, "trojuholnik");
        styl = st;
    }

    Trojuholnik(double x) {
        super(x, "trojuholnik");
        styl = "vyplnený";
    }

    Trojuholnik(Trojuholnik obj) {
        super(obj);
        styl = obj.styl;
    }

    double plocha() {
        return vratSirku() * vratVysku() / 2;
    }

    void zobrazStyl() {
        System.out.println("Trojuholnik je " + styl);
    }
}

class Pravouholnik extends Tvar2D {
    Pravouholnik() {
        super();
    }

    Pravouholnik(double s, double v) {
        super(s, v, "pravouholnik");
    }

    Pravouholnik(double x) {
        super(x, "pravouholnik");
    }

    Pravouholnik(Pravouholnik obj) {
        super(obj);
    }

    boolean jeStvorec() {
        if (vratSirku() == vratVysku()) return true;
        return false;
    }

    double plocha() {
        return vratSirku() * vratVysku();
    }
}

class AbstraktnyTvar {
    public static void main(String[] args) {
        Tvar2D tvary[] = new Tvar2D[4];

        tvary[0] = new Trojuholnik("obtažený", 8.0, 12.0);
        tvary[1] = new Pravouholnik(10);
        tvary[2] = new Pravouholnik(10, 4);
        tvary[3] = new Trojuholnik(7.0);

        for (int i=0; i<tvary.length; i++) {
            System.out.println("Objekt: " + tvary[i].vratNazov());
            System.out.println("Plocha je " + tvary[i].plocha());
            System.out.println();
        }
    }
}
