package Vynimky;

public class UkazkaThrows {
    public static char vyzva(String retazec) throws java.io.IOException {
        System.out.print(retazec + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char zn;

        try {
            zn = vyzva("Zadajte písmeno");
        }
        catch(java.io.IOException vynimka) {
            System.out.println("Došlo k vstupno-výstupnej výnimke.");
            zn = 'X';
        }
        System.out.println("Stlačili ste " + zn);
    }
}
