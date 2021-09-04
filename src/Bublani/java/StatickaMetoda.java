package Bublani.java;

class StatickaMetoda {
    static int hodnota = 1024; // statická premenná

    //statická metóda
    static int polovicaHodnoty() {
        return hodnota / 2;
    }
}

class UkazkaStatic2 {
    public static void main(String[] args) {
        System.out.println("hodnota je " + StatickaMetoda.hodnota);
        System.out.println("StatickaMetoda.polovicaHodnoty(): " + StatickaMetoda.polovicaHodnoty());

        StatickaMetoda.hodnota = 4;
        System.out.println("hodnota je " + StatickaMetoda.hodnota);
        System.out.println("StatickaMetoda.polovicaHodnoty(): " + StatickaMetoda.polovicaHodnoty());
    }
}

/*
Metódy deklarované ako statické majú niekoľko obmedzení:
- môžu priamo volať iba dalšie statické metódy.
- môžu priamo pristupovať iba k statickým dátam.
- nemajú odkaz this.
 */
