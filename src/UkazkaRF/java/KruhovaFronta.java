/*
package UkazkaRF.java;

public class KruhovaFronta implements RZnakovaF {
    private char f[];
    private int lokVloz, lokVyzdvihni;

    public KruhovaFronta(int velkost) {
        f = new char[velkost + 1];
        lokVloz = lokVyzdvihni = 0;
    }

    public void vloz(char zn) {
        if (lokVloz+1 == lokVyzdvihni | ((lokVloz == f.length-1) & (lokVyzdvihni==0))) {
            System.out.println(" - Fronta je plná.");
            return;
        }

        lokVloz++;
        if (lokVloz == f.length) lokVloz = 0;
        f[lokVloz] = zn;
    }

    public char vyzdvihni() {
        if (lokVyzdvihni == lokVloz) {
            System.out.println(" - Fronta je prázdna.");
            return (char) 0;
        }

        lokVyzdvihni++;
        if (lokVyzdvihni == f.length) lokVyzdvihni = 0;
        return f[lokVyzdvihni];
    }
}
*/