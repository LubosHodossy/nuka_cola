package Bublani.java;

public class CyklusForEach {
    public static void main(String[] args) {
        int cisla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sucet = 0;

        for (int x:cisla) {
            System.out.println("Hodnota je: " + x);
            sucet += x;
            if (x == 5) break;
        }
        System.out.println("Súčet: " + sucet);
    }
}
