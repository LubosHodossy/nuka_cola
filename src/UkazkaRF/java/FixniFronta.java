/*
package UkazkaRF.java;

public class FixniFronta implements RZnakovaF {
    private char f[];
    private int lokVloz, lokVyzdvihni;

    public FixniFronta(int velkost) {
        f = new char[velkost + 1];
        lokVloz = lokVyzdvihni = 0;
    }

    public void vloz(char zn) {
        if (lokVloz == f.length-1) {
            System.out.println(" - Fronta je plná.");
            return;
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