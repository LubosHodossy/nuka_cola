package Bublani.java;

public class Blok {
    int a, b, c;
    int objem;

    Blok(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        objem = a * b * c;
    }

    boolean rovnakyBlok(Blok obj) {
        if ((obj.a == a) & (obj.b == b) & (obj.c == c)) return true;
        else return false;
    }

    boolean rovnakyObjem(Blok obj) {
        if (obj.objem == objem) return true;
        else return false;
    }
}

class PredavanieObjektu {
    public static void main(String[] args) {
        Blok blok1 = new Blok(10, 2, 5);
        Blok blok2 = new Blok(10, 2, 5);
        Blok blok3 = new Blok(4, 5, 5);

        System.out.println("blok1 má rovnaké rozmery ako blok2: " + blok1.rovnakyBlok(blok2));
        System.out.println("blok1 má rovnaké rozmery ako blok3: " + blok1.rovnakyBlok(blok3));
        System.out.println("blok1 má rovnaký objem ako blok3: " + blok1.rovnakyObjem(blok3));
    }
}
