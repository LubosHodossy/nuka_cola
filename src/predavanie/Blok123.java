package predavanie;

public class Blok123 {
    int a, b, c;
    int objem;

    Blok123(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        objem = a*b*c;
    }

    boolean rovnakyBlok123(Blok123 obj) {
        if ((obj.a == a) & (obj.b == b) & (obj.c == c)) return true;
        else return false;
    }

    boolean rovnakyObjem(Blok123 obj) {
        if (obj.objem == objem) return true;
        else return false;
    }
}

class PredavanieObjektu123 {
    public static void main(String[] args) {
        Blok123 blok1 = new Blok123 (10, 2, 5);
        Blok123 blok2 = new Blok123 (10, 2, 5);
        Blok123 blok3 = new Blok123 (4, 5, 5);

        System.out.println("Blok1 má rovnaké rozmery ako Blok2: " + blok1.rovnakyBlok123(blok2));
        System.out.println("Blok1 má rovnaké rozmery ako Blok3: " + blok1.rovnakyBlok123(blok3));
        System.out.println("Blok1 má rovnaký objem ako Blok3: " + blok1.rovnakyObjem(blok3));
    }
}

