package Bublani.java;

public class Hladanie {
    public static void main(String[] args) {
        int cisla[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int hodnota = 5;
        boolean nalezeno = false;

        for (int x : cisla) {
            if (x == hodnota) {
                nalezeno = true;
                break;
            }
        }

        if (nalezeno)
            System.out.println("Hodnota nalezena !");
    }
}
