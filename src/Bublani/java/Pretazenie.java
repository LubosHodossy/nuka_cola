package Bublani.java;

class Pretazenie {
    void ukazkaPretazenie() {
        System.out.println("Bez parametrov");
    }

    void ukazkaPretazenie(int a) {
        System.out.println("Jeden parameter: " + a);
    }

    int ukazkaPretazenie(int a, int b) {
        System.out.println("Dva parametre: " + a + " " + b);
        return a + b;
    }

    double ukazkaPretazenie(double a, double b) {
        System.out.println("Dva parametre typu double: " + a + " " + b);
        return a + b;
    }
}

class UkazkaPretazenie {
    public static void main(String[] args) {
        Pretazenie obj = new Pretazenie();
        int cisloInt;
        double cisloDouble;

        obj.ukazkaPretazenie();
        System.out.println();

        obj.ukazkaPretazenie(2);
        System.out.println();

        cisloInt = obj.ukazkaPretazenie(4, 6);
        System.out.println("Výsledok obj.ukazkaPretazenie(4, 6): " + cisloInt);
        System.out.println();

        cisloDouble = obj.ukazkaPretazenie(1.1, 2.32);
        System.out.println("Výsledok obj.ukazkaPretazenie(1.1, 2.32): " + cisloDouble);
    }
}
