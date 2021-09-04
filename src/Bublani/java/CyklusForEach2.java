package Bublani.java;

public class CyklusForEach2 {
    public static void main(String[] args) {
        int sucet = 0;
        int cisla[][] = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                cisla[i][j] = (i+1)*(j+1);

            for (int x[] : cisla) {
                for (int y : x) {
                    System.out.println("Hodnota je: " + y);
                    sucet += y;
                }
            }
        System.out.println("Súčet: " + sucet);
    }
}
