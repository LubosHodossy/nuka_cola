package Bublani.java;

public class Bublani {
    public static void main(String[] args) {
        int i;
        int cisla1[] = new int[10];
        int cisla2[] = new int[10];

        for (i=0; i<cisla1.length; i++)
            cisla1[i] = i;

        if (cisla2.length >= cisla1.length)
            for (i=0; i<cisla1.length; i++)
                cisla2[i] = cisla1[i];

            for (i=0; i<cisla2.length; i++)
                System.out.print(cisla2[i] + " ");
    }
}
