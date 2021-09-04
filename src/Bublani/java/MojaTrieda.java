package Bublani.java;

public class MojaTrieda {
    private int alfa;
    public int beta;
    int gama;

    void nastavAlfa(int a) {
        alfa = a;
    }

    int vratAlfa() {
        return alfa;
    }
}

class UkazkaPristup {
    public static void main(String[] args) {
        MojaTrieda obj = new MojaTrieda();

        obj.nastavAlfa(-99);
        System.out.println("obj.alfa je " + obj.vratAlfa());

        obj.beta = 88;
        obj.gama = 99;
    }
}
