package Bublani.java;

class VarPocetArg {
    static void vaTest(int ... vpa) {
        System.out.println("Počet argumentov: " + vpa.length);
        System.out.println("Obsah: ");

        for (int i=0; i<vpa.length; i++) System.out.println(" argument " + i + ": " + vpa[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
