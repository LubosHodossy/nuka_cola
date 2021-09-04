package Dedicnost;

class ChybovaSprava {
    final int CHYBA_VYSTUPU = 0;
    final int CHYBA_VSTUPU = 1;
    final int CHYBA_DISKU = 2;
    final int CHYBA_INDEXU = 3;

    String spravy[] = {
            "Chyba výstupu",
            "Chyba vstupu",
            "Disk je plný",
            "Index mimo hranice"
    };

    String vratChybovuSpravu(int i) {
        if (i >= 0 & i < spravy.length)
            return spravy[i];
        else
            return "Neplatný kód chyby";
    }
}

class UkazkaFinal {
    public static void main(String[] args) {
        ChybovaSprava chyba = new ChybovaSprava();

        System.out.println(chyba.vratChybovuSpravu(chyba.CHYBA_VYSTUPU));
        System.out.println(chyba.vratChybovuSpravu(chyba.CHYBA_DISKU));
    }
}
