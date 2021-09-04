/*
package UkazkaRF.java;

import RZnakovaF.java.RZnakovaF;

public class UkazkaRF {
    public static void main(String[] args) {
        FixniFronta f1 = new FixniFronta(10);
        DynFronta f2 = new DynFronta(5);
        KruhovaFronta f3 = new KruhovaFronta(10);
        RZnakovaF rF;
        char zn;
        int i;

        rF = (RZnakovaF) f1;
        for (i=0; i<10; i++)
            rF.vloz((char) ('A' + i));

        System.out.print("Obsah fixní fronty: ");
        for (i=0; i<10; i++) {
            zn = rF.vyzdvihni();
            System.out.print(zn);
        }
        System.out.println();

        rF = (RZnakovaF) f2;
        for (i=0; i<10; i++)
            rF.vloz((char) ('Z' - i));

        System.out.print("Obsah dynamickej fronty: ");
        for (i=0; i<10; i++) {
            zn = rF.vyzdvihni();
            System.out.print(zn);
        }
        System.out.println();

        rF = (RZnakovaF) f3;
        for (i=0; i<10; i++)
            rF.vloz((char) ('A' + i));

        System.out.print("Obsah kruhovej fronty: ");
        for (i=0; i<10; i++) {
            zn = rF.vyzdvihni();
            System.out.print(zn);
        }
        System.out.println();

        for (i=10; i<20; i++)
            rF.vloz((char) ('A' + i));

        System.out.print("Obsah kruhovej fronty: ");
        for (i=0; i<10; i++) {
            zn = rF.vyzdvihni();
            System.out.print(zn);
        }
        System.out.println("\nVkladanie a vyzdvihovanie z kruhovej fronty.");

        for (i=0; i<20; i++) {
            rF.vloz((char) ('A' + i));
            zn = rF.vyzdvihni();
            System.out.print(zn);
        }
    }
}
*/