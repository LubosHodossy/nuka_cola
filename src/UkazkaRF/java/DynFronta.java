/*
package UkazkaRF.java;

public class DynFronta implements RZnakovaF {
    private char f[];
    private int lokVloz, lokVyzdvihni;

    public DynFronta(int velkost) {
        f = new char[velkost + 1];
        lokVloz = lokVyzdvihni = 0;
    }

    public void vloz(char zn) {
        if (lokVloz == f.length-1) {
            char t[] = new char[f.length*2];

            for (int i=0; i<f.length; i++)
                t[i] = f[i];

            f = t;
        }

        lokVloz++;
        f[lokVloz] = zn;
    }

    public char vyzdvihni() {
        if (lokVyzdvihni == lokVloz) {
            System.out.println(" - Fronta je prázdna.");
            return (char) 0;
        }

        lokVyzdvihni++;
        return f[lokVyzdvihni];
    }
}
*/