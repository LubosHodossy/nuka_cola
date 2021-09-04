package Bublani.java;

class Faktorial {
    int faktR(int n) {
        int result;

        if (n==1) return 1;
        result = faktR(n-1) * n;
        return result;
    }

    int faktI(int n) {
        int t, result;

        result = 1;
        for (t=1; t<=n; t++) result *=t;
        return result;
    }
}

class Rekurze {
    public static void main(String[] args) {
        Faktorial f = new Faktorial();

        System.out.println("Faktoriály pomocou rekurzivnej metody.");
        System.out.println("Faktoriál čísla 3 je " + f.faktR(3));
        System.out.println("Faktoriál čísla 4 je " + f.faktR(4));
        System.out.println("Faktoriál čísla 5 je " + f.faktR(5));
        System.out.println();

        System.out.println("Faktoriály pomocou iterativnej metody.");
        System.out.println("Faktoriál čísla 3 je " + f.faktI(3));
        System.out.println("Faktoriál čísla 4 je " + f.faktI(4));
        System.out.println("Faktoriál čísla 5 je " + f.faktI(5));
    }
}
