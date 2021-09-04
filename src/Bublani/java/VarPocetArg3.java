package Bublani.java;

class VarPocetArg3 {
    static void vaTest(int ... vpa) {
        System.out.println("vaTest(int ...): " + "Počet argumentov: " + vpa.length);
        System.out.println("Obsah: ");

        for (int i=0; i<vpa.length; i++) System.out.println(" argumenty " + i + ": " + vpa[i]);
        System.out.println();
    }

    static void vaTest(boolean ... vpa) {
        System.out.println("vaTest(boolean ...): " + "Počet argumentov: " + vpa.length);
        System.out.println("Obsah: ");

        for (int i=0; i<vpa.length; i++) System.out.println(" argumenty " + i + ": " + vpa[i]);
        System.out.println();
    }

    static void vaTest(String sprava, int ... vpa) {
        System.out.println("vaTest(String, int ...): " + sprava + vpa.length);
        System.out.println("Obsah: ");

        for (int i=0; i<vpa.length; i++) System.out.println(" argumenty " + i + ": " + vpa[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testovanie: ", 10, 20);
        vaTest(true, false, false);
    }
}
