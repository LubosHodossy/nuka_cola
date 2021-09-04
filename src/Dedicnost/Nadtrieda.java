package Dedicnost;

class Nadtrieda {
    void kto() {
        System.out.println("kto() v triede Nadtrieda");
    }
}

class Podtrieda1 extends Nadtrieda {
    void kto() {
        System.out.println("kto() v triede Podtrieda1");
    }
}

class Podtrieda2 extends Nadtrieda {
    void kto() {
        System.out.println("kto() v triede Podtrieda2");
    }
}

class UkazkaDynOdbMetod {
    public static void main(String[] args) {
        Nadtrieda objNadtriedy = new Nadtrieda();
        Podtrieda1 objPodtriedy1 = new Podtrieda1();
        Podtrieda2 objPodtriedy2 = new Podtrieda2();

        Nadtrieda odkazNaNadtriedu;

        odkazNaNadtriedu = objNadtriedy;
        odkazNaNadtriedu.kto();

        odkazNaNadtriedu = objPodtriedy1;
        odkazNaNadtriedu.kto();

        odkazNaNadtriedu = objPodtriedy2;
        odkazNaNadtriedu.kto();
    }
}
