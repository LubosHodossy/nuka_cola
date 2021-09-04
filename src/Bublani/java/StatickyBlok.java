package Bublani.java;

class StatickyBlok {
    static double odmocnina2;
    static double odmocnina3;

    static {
        System.out.println("Vnútri statického bloku.");
        odmocnina2 = Math.sqrt(2.0);
        odmocnina3 = Math.sqrt(3.0);
    }

    StatickyBlok(String sprava) {
        System.out.println(sprava);
    }
}

class UkazkaStatic3 {
    public static void main(String[] args) {
        StatickyBlok obj = new StatickyBlok("Vnútri konštruktora");

        System.out.println("Odmocnina čísla 2 je " + StatickyBlok.odmocnina2);
        System.out.println("Odmocnina čísla 3 je " + StatickyBlok.odmocnina3);
    }
}

// Ako môžeme vidieť, statický blok sa prevedie ešte pred zostrojením akýchkolvek objektov.