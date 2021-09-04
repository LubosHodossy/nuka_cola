package UkazkaVynimkyFronta.java;

public class VynimkaPlnaFronta extends Exception {
    int velkost;

    VynimkaPlnaFronta(int v) {
        velkost = v;
    }

    public String toString() {
        return "\nFronta je plná. Maximálna veľkosť je " + velkost;
    }
}

class VynimkaPrazdnaFronta extends Exception {
    public String toString() {
        return "\nFronta je prázdná.";
    }
}
