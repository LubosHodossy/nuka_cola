package Bublani.java;

class VarPocetArg2 {
    static void vaTest(String sprava, int ... vpa) {
        System.out.println(sprava + vpa.length);
        System.out.println("Obsah: ");

        for (int i=0; i<vpa.length; i++) System.out.println(" argumenty " + i + ": " + vpa[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Jeden argument variabilnej dĺžky: ", 10);
        vaTest("Tri argumenty variabilnej dĺžky: ", 1, 2, 3);
        vaTest("Žiadne argumenty variabilnej dĺžky: ");
    }
}
