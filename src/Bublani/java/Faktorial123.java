package Bublani.java;

public class Faktorial123 {
    int faktR(int n) {
        int vysledok;

        if (n == 1) return 1;
        vysledok = faktR(n-1)*n;
        return vysledok;
    }
}

class Rekurze123 {
    public static void main(String[] args) {
        Faktorial123 f = new Faktorial123();

        System.out.println("Faktoriál čísla 3 je " + f.faktR(3));
        System.out.println("Faktoriál čísla 4 je " + f.faktR(4));
        System.out.println("Faktoriál čísla 5 je " + f.faktR(5));
    }
}
