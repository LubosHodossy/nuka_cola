package Bublani.java;

class Chyba {
    String sprava; //chybová správa
    int zavaznost; //kód signalizujúci závažnosť chyby

    Chyba(String spr, int zav) {
        sprava = spr;
        zavaznost = zav;
    }
}

class InfoChyby {
    String spravy[] = {
            "Chyba výstupu",
            "Chyba vstupu",
            "Disk je plný",
            "Index mimo hranice"
    };
    int jakzle[] = { 3, 3, 2, 4 };

    Chyba vratInfoChyby(int i) {
        if (i >= 0 & i < spravy.length)
            return new Chyba(spravy[i], jakzle[i]);
        else
            return new Chyba("Neplatný kód chyby", 0);
    }
}

class UkazkaInfoChyby {
    public static void main(String[] args) {
        InfoChyby chyba = new InfoChyby();
        Chyba ch;

        ch = chyba.vratInfoChyby(2);
        System.out.println(ch.sprava + ", závažnosť: " + ch.zavaznost);

        ch = chyba.vratInfoChyby(19);
        System.out.println(ch.sprava + ", závažnosť: " + ch.zavaznost);
    }
}
