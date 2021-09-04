package Bublani.java;

class Fronta {
    private char f[];
    private int lokVloz, lokVyzdvihni;

    Fronta(int velkost) {
        f = new char[velkost+1];
        lokVloz = lokVyzdvihni = 0;
    }

    Fronta(Fronta obj) {
        lokVloz = obj.lokVloz;
        lokVyzdvihni = obj.lokVyzdvihni;
        f = new char[obj.f.length];

        for (int i=lokVyzdvihni+1; i <= lokVloz; i++)
            f[i] = obj.f[i];
    }

    Fronta(char pole[]) {
        lokVloz = 0;
        lokVyzdvihni = 0;
        f = new char[pole.length+1];

        for (int i=0; i < pole.length; i++) vloz(pole[i]);
    }

    void vloz(char zn) {
        if (lokVloz == f.length-1) {
            System.out.println(" - Fronta je plná.");
            return;
        }

        lokVloz++;
        f[lokVloz] = zn;
    }

    char vyzdvihni() {
        if (lokVyzdvihni == lokVloz) {
            System.out.println(" - Fronta je prázdná.");
            return (char) 0;
        }

        lokVyzdvihni++;
        return f[lokVyzdvihni];
    }
}

class UkazkaFronta {
    public static void main(String[] args) {
        Fronta f1 = new Fronta(10);
        char nazov[] = {'T', 'o', 'm'};
        Fronta f2 = new Fronta(nazov);
        char ch;
        int i;
        for (i=0; i<10; i++)
            f1.vloz((char) ('A' + i));

        Fronta q3 = new Fronta(f1);

        System.out.print("Obsah f1: ");
        for (i=0; i<10; i++) {
            ch = f1.vyzdvihni();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Obsah f2: ");
        for (i=0; i<3; i++) {
            ch = f2.vyzdvihni();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Obsah q3: ");
        for (i=0; i<10; i++) {
            ch = q3.vyzdvihni();
            System.out.println(ch);
        }
    }
}
