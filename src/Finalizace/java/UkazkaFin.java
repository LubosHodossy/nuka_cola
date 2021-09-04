package Finalizace.java;

public class UkazkaFin {
    int x;

    UkazkaFin(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Finalizuji " + x);
    }

    void generator(int i) {
        UkazkaFin o = new UkazkaFin(i);
    }
}

class Finalizace {
    public static void main(String[] args) {
        int pocet;

        UkazkaFin ob = new UkazkaFin(0);

        for (pocet = 1; pocet < 1000000; pocet++)
            ob.generator(pocet);
    }
}
